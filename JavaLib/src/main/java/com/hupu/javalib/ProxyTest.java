package com.hupu.javalib;

import com.test.inteface.Animal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {


    static class Dog implements Animal {

        @Override
        public void say(String msg) {
            System.out.println("wangwang"+msg);
        }
    }

    public static void main(String[] args) {

        Animal proxy = (Animal) ProxyTest.getProxy(Animal.class);
        proxy.say("1");
        proxy.say("2");

    }

    public static Object getProxy(Class service) {
        return Proxy.newProxyInstance(service.getClassLoader(),new Class[]{service}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] objects) throws Throwable {
//                method.getAnnotation()
                return method.invoke(new Dog(), objects);
            }
        });
    }

}
