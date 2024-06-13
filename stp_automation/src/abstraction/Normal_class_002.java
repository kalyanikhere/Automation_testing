package abstraction;

public class Normal_class_002 extends Abstract_class_002 {

	
	public static void main(String[] args) {
		Normal_class_002 x = new Normal_class_002();
		x.level();
		x.unit();

	}

	@Override
	public void level() {

System.out.println("check the levels");
		
	}

	@Override
	public void unit() {
		System.out.println("check unit fuctions");
	}

	

}
