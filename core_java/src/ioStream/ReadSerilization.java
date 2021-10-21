package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadSerilization {
public static void main(String[] args) throws Exception {
	FileInputStream f=new FileInputStream("D:/Object.ser");
	ObjectInputStream o=new ObjectInputStream(f);
	Serilization s=(Serilization)(o.readObject());
	System.out.println(s.getName());
	System.out.println(s.getPassword());
	o.close();
	f.close();
}
}
