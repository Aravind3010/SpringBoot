package task;

public class Example {
     int x;
     
	public static void main(String[] args) {
	Example a=new Example();
	System.out.println(a.x=10);
	
	Example b=new Example();
	b=a;
	System.out.println(b.x);
	}
	}
