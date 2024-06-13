package inheritance;

public class P extends H {
 
	int a = 3;
	
	public static void main(String[] args) {

    /* H dig = new H();
     System.out.println(dig.j);
     dig.gum();
    */
		
//		3rd property
		
		H held = new P();
		held.gum();
		System.out.println(held.j);
		
//	  4th property	
//		p get = new H(); it is not created here just write it so to understand it
//		P get= new H();
		
		
		
	}

}
