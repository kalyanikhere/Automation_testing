package stp;

public class Local_variable {

	
	public void big() {
		short h = 50;
		System.out.println(h);
	}
	
	public static void name() {
		double k = 90.45;
		System.out.println(k);
	}
	
	public static void main(String[] args) {
//		instance method(create object for instance method
		Local_variable n = new Local_variable();
		n.big();
//		static method
		name();

	}
//local variable can access in same method where they declare 
}
