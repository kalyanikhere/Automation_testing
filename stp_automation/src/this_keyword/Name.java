package this_keyword;

public class Name extends Submit{
   
	String b= "automation";
	
	public void function() {
		System.out.println(this.b);
		System.out.println(super.b);
		super.function();
		System.out.println("verify functions");
	}
	
	public Name() {
		super (45,65.5f);
		System.out.println("user define constructor of child class");
	}
	public static void main(String[] args) {
		Name sd = new Name ();
		sd.function();
	}

}
