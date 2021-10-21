package threads;

public class MultiThreading implements Runnable   {
public String name;
public MultiThreading() {
	
}
public MultiThreading(String name) {
	this.name=name;
}
public void run() {
	for (int i = 0; i < 50; i++) {
		System.out.println(i+" "+name);
	}

}
}
