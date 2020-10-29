package com.hupu.javalib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.zip.ZipEntry;

public class Test {
    public static void main(String[] args) throws IOException {

        String path ="/Users/tanghao/Desktop/autolib.jar";

        try {
            unzipJar(path,"/Users/tanghao/Desktop/autolib");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        String path = "/Users/tanghao/Desktop/autolib";
//        zipJar(path, "/Users/tanghao/Desktop/autolib1.jar");

    }

    /**
     * 将该jar包解压到指定目录
     *
     * @param jarPath     jar包的绝对路径
     * @param destDirPath jar包解压后的保存路径
     * @return List < File >
     */
    static List<File> unzipJar(String jarPath, String destDirPath) throws IOException {
        List<File> fileList = new ArrayList<>();
        if (jarPath.endsWith(".jar")) {
            JarFile jarFile = new JarFile(jarPath);
            Enumeration<JarEntry> jarEntries = jarFile.entries();
            while (jarEntries.hasMoreElements()) {
                JarEntry jarEntry = jarEntries.nextElement();
                if (jarEntry.isDirectory()) {
                    continue;
                }
                String entryName = jarEntry.getName();
                String outFileName = destDirPath + File.separator + entryName;
                File outFile = new File(outFileName);
                fileList.add(outFile);
                outFile.getParentFile().mkdirs();
                InputStream inputStream = jarFile.getInputStream(jarEntry);
                FileOutputStream fileOutputStream = new FileOutputStream(outFile);

                byte[] b = new byte[inputStream.available()];
                inputStream.read(b);
                fileOutputStream.write(b);

                fileOutputStream.close();
                inputStream.close();
            }
            jarFile.close();
        }

        return fileList;
    }


    /**
     * 重新打包jar
     *
     * @param packagePath 将这个目录下的所有文件打包成jar
     * @param destPath    打包好的jar包的绝对路径
     */
    static void zipJar(String packagePath, String destPath) throws IOException {
        File file = new File(packagePath);
        JarOutputStream outputStream = new JarOutputStream(new FileOutputStream(destPath));

        for (File f : getFileList(file, new ArrayList<>())) {
            if (!f.isDirectory()) {
                String entryName = f.getAbsolutePath().substring(file.getAbsolutePath().length() + 1);
                outputStream.putNextEntry(new ZipEntry(entryName));
                InputStream inputStream = new FileInputStream(f);

                byte[] b = new byte[inputStream.available()];
                inputStream.read(b);
                outputStream.write(b);

                inputStream.close();
            }
        }

        outputStream.close();
    }

    static List<File> getFileList(File dir, List<File> files) throws IOException {
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                getFileList(f,files);
            } else {
                files.add(f);
            }
        }

        return files;
    }

}
