package abstraction;

public class Normal_class_001 extends Abstraction_class_001{

	public static void defects() {
		System.out.println("enlist the defects");
	}
	
	public static void main(String[] args) {
		Normal_class_001 g = new Normal_class_001();
		g.defects();
		g.fill();
		g.get();
		g.detect();

	}

	@Override
	public void detect() {
   System.out.println("detect the defects");
		
	}

	@Override
	public void get() {
		System.out.println("get the defect reports");
		
	}

}
