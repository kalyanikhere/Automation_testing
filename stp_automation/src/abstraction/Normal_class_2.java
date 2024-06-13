package abstraction;

public class Normal_class_2 extends Abstract_class_3 {

	public static void main(String[] args) {
		Normal_class_2 k = new Normal_class_2();
		k.username();
		k.password();


	}

	@Override
	public void username() {

System.out.println("enter email or phone number");
		
	}

	@Override
	public void password() {

System.out.println("password must be 6 digit");
		
	}

}
