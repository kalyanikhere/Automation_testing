package multi_level_inheritance;

public class C extends  B{
	
 public static void username() {
	System.out.println("enter user name"); 
 }
	public static void main(String[] args) {
		C hj= new C();
		hj.login();
		System.out.println(hj.a);
		hj.username();
		
		
	}

}
