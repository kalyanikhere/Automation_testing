package scanner_class;

import java.util.Scanner;

public class Scanner_class_for_loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		give the table of any number
		
		System.out.println("enter any number to get the table ");		
		int d = sc.nextInt();
		
		System.out.println("get the table");
		for(int v=1; v<=10;v++) {
		System.out.println("the table is : "+d+"*"+v+"="+(d*v));
	
	}

	}
	}
