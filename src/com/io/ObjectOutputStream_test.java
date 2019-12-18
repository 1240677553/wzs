package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout=new FileOutputStream("Obj.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		Person p1=new Person("mike",40); 
		out.writeObject(p1);
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\Obj.txt"));
		Person person=(Person)in.readObject();
		System.out.println("name="+person.getName());
		System.out.println("age="+person.getAge());

	}

}
