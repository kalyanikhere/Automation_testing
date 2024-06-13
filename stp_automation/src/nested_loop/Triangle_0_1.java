package nested_loop;

public class Triangle_0_1 {

	public static void main(String[] args) {
// rows 4 and 4 columns
		
	for(int d=1; d<=4; d++) {
		for(int e=1; e<=d; e++) {
			int f= d+e;
			if(f%2==0) {
				System.out.print("1 ");
			}
			else {
				System.out.print("0 ");
			}
		
		}
		System.out.println();
	}
		
	}

}
