package com.java.Serializations;
import java.io.*;

class Account implements Serializable
{
	String userName="Imran";
	transient String pwd="pass123";
}

public class CustomizedSerializeTransient
{
	public static void main(String[] args) throws Exception{
		
		Account a1=new Account();
		
		System.out.println(a1.userName+"........."+a1.pwd);
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Account a2=(Account)ois.readObject();
		
		System.out.println(a2.userName+"........."+a2.pwd);
}
}