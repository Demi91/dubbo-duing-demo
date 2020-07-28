package com.duing;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 由于远程方法调用的本质依然是网络通信，
 * 只不过隐藏了底层实现，网络通信是经常会出现异常的，
 * 所以接口的所有方法都必须抛出RemoteException以说明该方法是有风险的
 */
public interface Hello extends Remote {
    public String sayHello(String name) throws RemoteException;
}
