package array;

public class Multidimentional_array_allocating_memory {

	public static void main(String[] args) {

//		 3 by 4 or 3*4 matrix
		
     int [][] list_no = new int[3][4];
        
		list_no [0][0]= 5;
		list_no [0][1]= 6;
		list_no [0][2]= 7;
		list_no [0][3]= 8;
	   	
		list_no [1][0]= 9;
		list_no [1][1]= 10;
		list_no [1][2]= 11;
		list_no [1][3]= 12;
		
		list_no [2][0]= 13;
		list_no [2][1]= 14;
		list_no [2][2]= 15;
		list_no [2][3]= 16;
        
//     to print all the values
//		here we can not count length but we can tell size of matrix will be 3*4=12
		
		for (int a =0; a<3;a++) {
			for (int b=0; b<4; b++) {
				System.out.print(list_no[a][b]+ " ");
			}
			System.out.println();
		}
     
	}

}
