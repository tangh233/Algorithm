package com.hupu.javalib;

import com.test.inteface.Animal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {


    static class Dog implements Animal {

        @Override
        public void say() {
            System.out.println("wangwang！！！");
        }
    }

    public static void main(String[] args) {
        Animal animal =new Dog();
        Animal proxy = (Animal) ProxyTest.getProxy(animal);
        proxy.say();
    }

    public static Object getProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
                return method.invoke(obj, objects);
            }
        });
    }

}
