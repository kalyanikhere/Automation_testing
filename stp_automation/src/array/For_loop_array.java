package array;

public class For_loop_array {

	public static void main(String[] args) {
		double []sum = new double [3];
		
		sum [0]= 54.67;
		sum [1]= 76.43;
		sum [2]= 65.2;
			
		for (int k =0; k<3; k++) {
			System.out.println("the given values are :"+sum[k]);
		}
			
			System.out.println("----------------------------------");          
		                                
            System.out.println("the size of array is : "+sum.length);      
            
          System.out.println("----------------------------------");     
          
          System.out.println("the value of index 2 is : "+sum [2]);     
    
	}

}
