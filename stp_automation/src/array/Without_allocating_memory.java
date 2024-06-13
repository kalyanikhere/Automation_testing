package array;

public class Without_allocating_memory {

	public static void main(String[] args) {
		
		long []note = {45, 36, 67, 78};
		
		System.out.println("the size count is : "+ note.length);
		
		System.out.println("--------------------------");
		
	for(long k : note)	{
		System.out.print(k+" ");
	}
		                                                                                       
	System.out.println();	
	System.out.println("----------------------------------------");
		
		for(int d=0; d<4; d++) {
			System.out.print(note[d]+" ");
		}
		
	System.out.println();
	System.out.println("--------------------------------------------");
	
	String [] book = {"manual", "automation","mobile"};
		
		for(String h : book ) {
			System.out.print(h+" ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");	
			
		
		for(int g=0; g<3; g++) {
			System.out.print(book[g]+" ");
		}
		
		
		System.out.println("the size count is: "+book.length);
		
		System.out.println("the index value of 2nd string is :"+book[2]);
		
		
		
		
		
		
		
	}

}
