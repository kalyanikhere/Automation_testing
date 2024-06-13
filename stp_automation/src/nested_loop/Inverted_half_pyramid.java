package nested_loop;

public class Inverted_half_pyramid {

	public static void main(String[] args) {
//		inverted half pyramid
//		6 columns and 6 rows
		
		for(int b=6; b>=1; b--) {
			for(int z=1; z<=b; z++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		
		for(int s=6; s>=1; s--) {
			for(int p=1; p<=s; p++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
	System.out.println("------------------------------------------");
		
	for(int u=6; u>=1; u--) {
		for(int t=1; t<=u; t++) {
			System.out.print(u+","+t+" ");
		}
		System.out.println();
	}
		
		
		
		
		
		

	}

}
