package nested_loop;

public class Floyds_triangle {

	public static void main(String[] args) {
//	5 rows and columns 5
		
		int h=1;
		for(int g=1; g<=5; g++) {
			for(int j=1; j<=g ; j++) {
				System.out.print(h+"  ");
				h++;
			}
			System.out.println();	
		}
	
	}

}
