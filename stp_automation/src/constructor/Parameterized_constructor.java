package constructor;

public class Parameterized_constructor {

	public Parameterized_constructor (int a, String b, double c) {
		System.out.println("Parameterized_constructor");
		System.out.println("the value of a is : "+a);
		System.out.println("the value of b is : "+b);
		System.out.println("the value of c is : "+c);
		System.out.println("----------------------------------");
	}
	
	
	public static void main(String[] args) {

		Parameterized_constructor h = new Parameterized_constructor(4,"manual testing",78.98);
	}

}
