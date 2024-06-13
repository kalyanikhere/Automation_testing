package stp;

public class Static_variable {
	static int b=48;
	static short h =60;
	static long k = 50;
	
	public void made() {
		System.out.println(b); 
		
	}
	public static void note() {
		System.out.println(h);
		
	}

	public static void main(String[] args) {
//		static variable class
		System.out.println(k);
//     instance method(create object for instance method
		Static_variable f=new Static_variable();
		f.made();
//		static method
		note();
	}
//static variable directly access in both static and instance method
}
