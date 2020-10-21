package com.hupu.javalib;

import java.io.File;
import java.io.IOException;
import java.nio.file.StandardCopyOption;

public class MyClass {
    public static void main(String[] args) {
        File fileFolder = new File("/Users/tanghao/Desktop/aliP7.PNG");
        File fileFolder2 = new File("/Users/tanghao/Desktop/aliP.PNG");

//        try {
//            java.nio.file.Files.copy(
//                    fileFolder.toPath(),
//                    fileFolder2.toPath(),
//                    StandardCopyOption.COPY_ATTRIBUTES,
//                    StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//        }


//        File fileFolder = new File("/Users/tanghao/Downloads/fans");
//        if (fileFolder.exists()) {
//            System.out.println(fileFolder.listFiles().length);
//            for (File file : fileFolder.listFiles()) {
//
//                if (file.getName().endsWith(".png")) {
//                    String fileName = file.getName();
//                    String fileStartStr = fileName.substring(0, fileName.indexOf("@"));
//
//                    file.renameTo(new File(file.getParent() + "/fans_level_" + fileStartStr + ".png"));
//                    System.out.println(file.getPath());
//                }
//            }
//        }
    }

}
