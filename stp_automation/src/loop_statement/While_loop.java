package loop_statement;

public class While_loop {

	public static void main(String[] args) {
		int h = 10;
		while (h <= 50) {
			System.out.print(h + " ");
			h++;
		}
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");

// reverse numbers
		int k = 50;
		while (k >= 10) {
			System.out.print(k + " ");
			k--;
		}
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");

// even numbers
		int b = 10;
		while (b <= 50) {
			if (b % 2 == 0) {
				System.out.print(b + " ");
			}
			b++;
		}
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");

		// odd numbers
		int c = 10;
		while (c <= 50) {
			if (c % 2 != 0) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");

//	without if statements find odd values

		int d = 10;
		while (d <= 50) {
			System.out.print((d * 2 + 1) + " ");
			d++;
		}
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");

//  without if statements find even values

		int e = 10;
		while (e <= 50) {
			System.out.print((e * 2) + " ");
			e++;
		}
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");

		
		int f=5;
		while(f<=50) {
			if(f%2==0) {
				System.out.println(f+" ");
			}
			f++;
		}
		
		
		
		
		
		
		
		
	}

}
