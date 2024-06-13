package jump_statement;

public class Break_statement {

	public static void main(String[] args) {

    for(int a=15; a>=1; a--) {
	System.out.print(a+" ");
	if(a==11) {
		break;
	}
	
}
    System.out.println();
	System.out.println("--------------------------------------------");	
	
	int b=20;
	while(b>=1) {
		System.out.print(b+" ");
		if(b==8) {
			break;
		}
		b--;
	}
	System.out.println();
	System.out.println("--------------------------------------------");	
	
	
	int c=10;
	do {
		System.out.print(c+" ");
		if(c==4) {
			break;
		}
		c--;
		}while(c>=1);
		
		
	System.out.println();
	System.out.println("--------------------------------------------");	

	}

}
