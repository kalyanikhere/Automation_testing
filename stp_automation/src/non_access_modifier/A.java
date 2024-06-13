package non_access_modifier;

public  class A {
	
  transient int a =10;
    
   public void get(int b) {
	  a = b;
	  System.out.println(b);
   }
	   
   
    
	public static void main(String[] args) {
   A h = new A ();
   System.out.println(h.a);
    h.get(15);

	}

}




