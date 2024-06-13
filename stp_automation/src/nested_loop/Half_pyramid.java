package nested_loop;

public class Half_pyramid {

	public static void main(String[] args) {
//		half pyramid
//		colums 6 and rows 6
		
		for(int k=1; k<=6; k++) {
			for(int m = 1; m<=k; m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		for(int g=1; g<=6; g++) {
			for(int n = 1; n<=g; n++) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		for(int j=1; j<=6; j++) {
			for(int v = 1; v<=j; v++) {
				System.out.print(j+","+v+" ");
			}
			System.out.println();
		}
		
//		4rows and 4 columns
		
		for(int a=1; a<=4; a++) {
			for(int b=1;b<=a; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		
		
		
		
		
		

		

	}

}
