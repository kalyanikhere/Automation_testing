package operator;

public class Comparision_operator {

	public static void main(String[] args) {
// greater than
		int a = 20;
		int b = 50;
		boolean c = a > b;
		System.out.println("the value of c is: " + c);
		System.out.println("--------------------");

//	less than
		int d = 40;
		short e = 70;
		boolean f = d < e;
		System.out.println("the value of f is: " + f);
		System.out.println("--------------------");

// greater than equal to
		long g = 30;
		double h = 60.5;
		boolean k = h >= g;
		System.out.println("the value of k is: " + k);
		System.out.println("--------------------");

// less than equal to
		long i = 10;
		float j = 69.5f;
		boolean l = j <= i;
		System.out.println("the value of l is: " + l);
		System.out.println("--------------------");

// equal to
		byte m = 35;
		float n = 89.5f;
		boolean o = m == n;
		System.out.println("the value of o is: " + o);
		System.out.println("--------------------");

// not equal to
		int p = 90;
		byte q = 99;
		boolean r = p != q;
		System.out.println("the value of r is: " + r);
		System.out.println("--------------------");

//		using one variable and compared it as per your requirement
		boolean s = h<100;
	}

}
