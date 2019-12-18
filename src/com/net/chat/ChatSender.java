package com.net.chat;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
private DatagramSocket client;
private int i;
public ChatSender(DatagramSocket client,int i) {
	this.client=client;
	this.i=i;
}

@Override
public void run() {
	// TODO 自动生成的方法存根
	Scanner sc=new Scanner(System.in);
	while(true) {
		String stc=sc.nextLine();
		byte[] zjsz;
	try {
		zjsz=stc.getBytes("UTF-8");
		System.out.println("这条信息要发送给哪个IP:");
		String ip=sc.nextLine();
		DatagramPacket packet= new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName("10.2.103.22"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	
	}
}
}
