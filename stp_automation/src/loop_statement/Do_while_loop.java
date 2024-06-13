package loop_statement;

public class Do_while_loop {

	public static void main(String[] args) {
		int z=30;
		do {
			System.out.print(z+" ");
			z++;
		}while(z<=70);
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
	
//		reverse numbers
		int v=70;
		do {
			System.out.print(v+" ");
			v--;
		}while(v>=30);
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
	
//		even numbers
		
		int n=30;
		do {
			if(n%2==0) {
			System.out.print(n+" ");
			}
			n++;
		}while(n<=70);
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
		
//		odd numbers
		
		int m=30;
		do {
			if(m%2!=0) {
			System.out.print(m+" ");
			}
			m++;
		}while(m<=70);
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
		
//	without if statement find odd values
		
		int x=30;
		do {
			System.out.print((x*2+1)+" ");
			x++;
		}while(x<=70);
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");
		
//		without if statement find even values
		
		int g=30;
		do {
			System.out.print((g*2)+" ");
			g++;
		}while(g<=70);
		
		System.out.println(" ");
		System.out.println("------------------------------------------");
		System.out.println(" ");	
		
		
		int h=6;
		do {
			if(h%2==0) {
			System.out.println(h);
			}
			h--;
		}while(h<=1);
		
		

	}
	
     
}
