package nested_loop;

public class Hollow_rectamgle {

	private static int d;
	private static int c;

	public static void main(String[] args) {
//	hollow rectangle
//		4 rows 
//		 5 columns
		
	/*for(int k=1; k<=4;k++)	{
		for(int b=1; b<=5;b++) {
			if(k==1 || k==4 || b==1 || b==5) {
				System.out.print("* ");
			}
			else {
		System.out.print("  ");
			}
	}
	System.out.println();	

	}*/
		
//	4rows 3 columns
		
		for(c=1; c<=4; c++) {
			for(d=1; d<=3; d++)
				if(c==1 || c==4 || d==1 || d==3) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
