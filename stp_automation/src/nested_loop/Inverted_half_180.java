package nested_loop;

public class Inverted_half_180 {

	private static int h;

	public static void main(String[] args) {
		
//		rows 4 and columns 4
		for(int a=1; a<=4;a++) {
//			to print space
			for(int b=1; b<=4-a; b++) {
				System.out.print("  ");
			}
//			to print star
			for(int c=1; c<=a; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------");
		
//		3 rows and 3 columns
		
		for(int g=1; g<=3;g++) {
//			to print space
			for(int h=1; h<=3-g; h++) {
				System.out.print("  ");
			}
//			 to print *
			for(int f=1; f<=g; f++) {
			System.out.print("* ");
		}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
