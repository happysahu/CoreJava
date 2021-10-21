package ioStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

public class TestIOStream {
public static void main(String[] args) throws Exception {
//	File f=new File("D:/Harsh.txt");
//	f.renameTo(f );
//	System.out.println(f.getName());
//	System.out.println(f.getAbsolutePath());
//	System.out.println(f.canRead());
//	System.out.println(f.canWrite());
//	System.out.println(f.isFile());
//	System.out.println(f.isDirectory());
//	System.out.println(new Date(f.lastModified()));
//	System.out.println(f.length());
	
	//Display Only File From Folder
	
//	
//	File directory=new File("D:/");
//	String[] list=directory.list();
//	for (int i = 0; i < list.length; i++) {
//		
//	
//		File f=new File("D:/",list[i]);
//		if(f.isFile()) {
//			
//			System.out.println(list[i]);
//		}
//	}
	
	//Read char From a file
	
//	FileReader ff=new FileReader("D:/Harsh.txt");
//	int ch=ff.read();
//	char g;
//	while(ch!=-1) {
//		g=(char)ch;
//		System.out.println(g);
//		 ch=ff.read();
	
	//Read a file Line by Line 
	
	FileReader ff=new FileReader("D:/Harsh.txt");
	BufferedReader b=new BufferedReader(ff);
	String line=b.readLine();
	
	while(line!=null) {
		
		System.out.println(line);
		 line=b.readLine();	}
	
}
}
