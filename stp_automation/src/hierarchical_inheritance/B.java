package hierarchical_inheritance;

public class B extends A{
	int a=15;
	
	public static void main(String[] args) {
		B sd = new B();
		sd.login();
		System.out.println(sd.a);
	}

}
