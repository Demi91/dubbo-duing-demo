package com.duing.client;

import com.duing.Hello;

import java.rmi.Naming;

public class RMIClient {

    public static void main(String[] args) {
        //远程调用RMI
        Hello hello = null;
        try{
            hello =(Hello) Naming.lookup("rmi://127.0.0.1:9090/RMIServer");
            Object ret = hello.sayHello("张先生");
            System.out.println("测试远程调用成功，返回结果："+ret);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}