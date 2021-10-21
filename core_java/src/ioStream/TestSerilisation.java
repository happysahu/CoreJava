package ioStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerilisation {
	public static void main(String[] args) throws Exception {
FileOutputStream out=new FileOutputStream("D:/Object.ser");
ObjectOutputStream ob=new ObjectOutputStream(out);
Serilization s=new Serilization("Harsh","1234");
ob.writeObject(s);
//out.close();
ob.close();
System.out.println("Done");
	}
}
