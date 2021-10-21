package ioStream;

import java.io.FileOutputStream;
import java.io.Serializable;

public class Serilization implements Serializable {
	
	private String name;
	private String Password;
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return Password;
	}
	public Serilization() {
		
	}
public Serilization(String name,String pass) {
		this.name=name;
		Password=pass;
	}
	
}
