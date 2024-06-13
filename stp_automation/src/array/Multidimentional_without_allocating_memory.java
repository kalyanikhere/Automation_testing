package array;

public class Multidimentional_without_allocating_memory {

	public static void main(String[] args) {

//	4*3 or 4 by 3 matrix	
		
       int[][] roll_no = {{4,5,6,},{3,7,8},{1,2,9},{10,11,12}};
       
       
//     to print all the values
//		here we can not count length but we can tell size of matrix will be 3*4=12
		
       for (int a =0; a<4;a++) {
			for (int b=0; b<3; b++) {
				System.out.print(roll_no[a][b]+ " ");
			}
			System.out.println();
		}
	}

}
