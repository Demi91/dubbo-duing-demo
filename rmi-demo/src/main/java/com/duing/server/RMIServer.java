package com.duing.server;

import com.duing.Hello;
import com.duing.HelloImpl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {

    public static void main(String[] args) {
        try {
            Hello rmi = new HelloImpl();
            //注册通讯端口
            LocateRegistry.createRegistry(9090);
            //注册通讯路径
            Naming.bind("rmi://127.0.0.1:9090/RMIServer", rmi);
            System.out.println("rmi服务端启动成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}