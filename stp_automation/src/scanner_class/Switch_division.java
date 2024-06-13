package scanner_class;

import java.util.Scanner;

public class Switch_division {

	public static void main(String[] args) {

		Scanner h = new Scanner(System.in);

// to enter 1st value
		System.out.println("give 1st value");
		int a = h.nextInt();

// to enter 2nd value
		System.out.println("give 2nd value");
		int p = h.nextInt();

// store the values in another variable
		System.out.println("operator");
		char j = h.next().charAt(0);
	
		System.out.println("give the switch statement value : ");
		
		switch (j) {

		case '+':
			System.out.println("addition of a and p"+"= "+(a+p));
			break;
		case '-':
			System.out.println("subtraction of a and p"+(a-p));
			break;
		case '*':
			System.out.println("multiplication of a and p"+(a*p));
			break;
		case '%':
			System.out.println("division of a and p"+(a%p));
			break;
		
			default:
				System.out.println("print default value");
		}
		
System.out.println("-----------------------------------------------------------------------------------");

	}

}
