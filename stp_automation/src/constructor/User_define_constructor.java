package constructor;

public class User_define_constructor {

	public User_define_constructor () {
		System.out.println("user define constructor_1");
		System.out.println("----------------------------------");
	}
	  
    public static void login() {
    	System.out.println("login functionality");
    }
	
	
	public static void main(String[] args) {

		User_define_constructor a= new User_define_constructor();

		login();
		
	}

}
