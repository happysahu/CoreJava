package core_java;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormate {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat h=new SimpleDateFormat("dd/MM/yyyy");
		String str=h.format(d);
		System.out.println(str);
	}

}
