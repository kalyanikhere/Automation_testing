package scanner_class;

import java.util.Scanner;

public class Scanner_class_string {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1st value");
		String a = sc.nextLine();
		System.out.println("2nd value");
		String b = sc.nextLine();
		
		String c = a.concat(b);
		System.out.println("the name of college is : "+a+" "+b);
		
		
		
		
	}

}
