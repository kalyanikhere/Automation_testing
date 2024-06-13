package stp;

public class Instance_variable {

	int a = 45;
	 short b =60;
	 long d = 50;
	 
//	instance method
	public void differ() {
		System.out.println(a);
		
}
  public static void sum() {
//	  create object for accessing instance variable in static method
	  Instance_variable g = new Instance_variable();
	  System.out.println(g.b);
	  
}	
	public static void main(String[] args) {
//		copy paste object for calling instance method in main method
		Instance_variable g = new Instance_variable();
		System.out.println(g.d);
//		instance method
		g.differ();
//		static method
		sum();
	}
/* instance variable can access directly in instance method but for accessing it
	in static method we have to create object*/
}
