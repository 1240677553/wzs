package com.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
	InetAddress localAddress=InetAddress.getLocalHost();
	InetAddress remoteAddress=InetAddress.getByName("www.itcast.cn");
	System.out.println("本机胡IP地址:"+localAddress.getHostAddress());
	System.out.println("itcast的IP地址:"+remoteAddress.getHostAddress());
	System.out.println("3秒内是否可以访问:"+remoteAddress.isReachable(3000));
	System.out.println("itcast的主机名为:"+remoteAddress.getHostName());

	}

}
