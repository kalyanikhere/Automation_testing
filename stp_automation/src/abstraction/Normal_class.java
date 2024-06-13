package abstraction;

public class Normal_class extends Abstract_class{

	public void match() {
		this.calculate();
		this.give();
		this.testing();
		this.unit();
		System.out.println("match the values");
	}
	
	public static void main(String[] args) {
		Normal_class v= new Normal_class ();
		v.match();


	}

	@Override
	public void calculate() {
   System.out.println("calculate using arithmatic operators");

		
	}

	@Override
	public void give() {
System.out.println("user need to enter user name and password");

	}

	@Override
	public void testing() {

System.out.println("stop the execution when exit criteria is meet");
		
	}

}
