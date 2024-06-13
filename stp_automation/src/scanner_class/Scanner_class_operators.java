package scanner_class;

import java.util.Scanner;

public class Scanner_class_operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st value");
		int h = sc.nextInt();
		System.out.println("2nd value");
		int k = sc.nextInt();
		
		System.out.println("give the operator value");
		int p = h+k;
		System.out.println("additon of h and k is : "+p);
		
        System.out.println("-------------------------------------------------");

	}

}
