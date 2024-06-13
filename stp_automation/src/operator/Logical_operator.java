package operator;

public class Logical_operator {

	public static void main(String[] args) {
//	logical and && (true, true= true)
	int a = 50;
	short b = 60;
	boolean c = a<b && b>a;
	System.out.println("the value of c is: "+c);
	System.out.println("----------------------------");	
		
//	logical and && (false, true= false)
	
	boolean f = a==b && b>a;
	System.out.println("the value of f is: "+f);
	System.out.println("----------------------------");		
		
//	logical and && (true, false= false)

	boolean d = a<b && a==b;
	System.out.println("the value of d is: "+d);
	System.out.println("----------------------------");		
			
//	logical and && (false, false= false)

	boolean e = a>b && a==b;
	System.out.println("the value of e is: "+e);
	System.out.println("----------------------------");	
		
//  logical or || (false, false = false)
		
	boolean g = a>b || b==a;
	System.out.println("the value of g is: "+g);
	System.out.println("----------------------------");	
		
//  logical or || (true, false = true)
		
	boolean h = a<b || b!=a;
	System.out.println("the value of h is: "+h);
	System.out.println("----------------------------");	
		
//  logical or || (true, false = true)
	
	boolean i = a<b || b!=a;
	System.out.println("the value of i is: "+i);
	System.out.println("----------------------------");	
			
//  logical or || (false, true = true)
	
	boolean k= a==b || b!=a;
	System.out.println("the value of k is: "+k);
	System.out.println("----------------------------");	
					
//		logical not!
		int v = 80;
		System.out.println("the value of v is: "+(!(v>100)));
		System.out.println(!(v==80));
		
		

	}

}
