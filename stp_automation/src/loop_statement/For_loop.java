package loop_statement;

public class For_loop {

	public static void main(String[] args) {

		for (int h = 20; h <= 40; ++h) {
			System.out.println(h);
		}
		System.out.println("---------------------------------");

//		reverse the number
		for (int k = 40; k >= 20; --k) {
			System.out.println(k);
		}
		System.out.println("---------------------------------");

//		even numbers
		for (int l = 1; l <= 60; ++l) {
			if (l % 2 == 0) {
				System.out.println(l);
			}
		}
		System.out.println("----------------------------");

//		reverse even numbers
		for (int m = 60; m >= 1; --m) {
			if (m % 2 == 0) {
				System.out.println(m);
			}
		}
		System.out.println("--------------------------------------");

//		odd numbers
		for (int n = 1; n <= 50; ++n) {
			if (n % 2 != 0) {
				System.out.println(n);
			}
		}
		System.out.println("----------------------------------------");

//		reverse odd numbers
		for (int p = 50; p >= 1; --p) {
			if (p % 2 != 0) {
				System.out.println(p);
			}
		}
		System.out.println("--------------------------------------------");

//	    find the table of 8
		for (int q = 1; q <= 10; ++q) {
			System.out.println(8 * q);
		}
		System.out.println("---------------------------------");

		/*
		 * find the table like 6*1=6 6*2=12
		 */
		for (int r = 1; r <= 10; ++r) {
			System.out.println("6*" + r + "=" + 6 * r);
		}
		System.out.println("---------------------------------");

	}

}
