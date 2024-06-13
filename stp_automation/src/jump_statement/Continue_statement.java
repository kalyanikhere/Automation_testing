package jump_statement;

public class Continue_statement {

	public static void main(String[] args) {

     for(int d=21; d>=1; d--) {
    	 if(d==16) {
    		 continue;
    	 }
    	 System.out.print(d+" ");
     }
     
     System.out.println();
 	System.out.println("--------------------------------------------");	
 	
	int e=32;
	while(e>=1) {
		e--;
		if(e==29) {
			continue;
		}
	  	System.out.print(e+" ");
	}
	
	System.out.println();
 	System.out.println("--------------------------------------------");	
 		
		
		int f=25;
		do {
			f--;
			if(f==22) {
				continue;
			}
			System.out.print(f+" ");
		}
		while(f>=1);
		

	}

}
