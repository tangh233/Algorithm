package com.tangh.alglibrary.java;

import android.os.Looper;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class RxTest {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        List<Integer> integers=new ArrayList<>();
        System.out.println(stringList.getClass()==integers.getClass());
    }
}
