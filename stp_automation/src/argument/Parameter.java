package argument;

public class Parameter {
	int a;
	static int p;
	String n;

	public void data(int b, boolean g, String m) {
		a = b;
		System.out.println("the value of a is: " + a);

		boolean h = g;
		System.out.println("the value of h is: " + h);

		n = m;
		System.out.println("the value of n is: " + n);
	}

	public static void verify(int q, char l) {
		p = q;
		System.out.println("the value of p is: " + p);

		char j = l;
		System.out.println("the value of j is: " + j);
	}

	public static void main(String[] args) {
		Parameter hk = new Parameter();
		hk.data(50, true, "notebook");
		verify(60, 'u');
	}

}
