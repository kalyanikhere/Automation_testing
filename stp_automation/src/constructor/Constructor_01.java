package constructor;

public class Constructor_01 {

	public Constructor_01() {
		this(45,65.4f);
		System.out.println("user define constructor");
		System.out.println("-------------------------------------------");
	}
	
	
	public Constructor_01(int a ,float b) {
		this("automation",8);
		System.out.println("parameterized constructor");
		System.out.println("-------------------------------------------");
	}
	
public Constructor_01(String g,int d) {
	System.out.println("parameterized constructor 1");
	System.out.println("-------------------------------------------");
}
	

	
	public static void main(String[] args) {

		Constructor_01 h = new Constructor_01();
//		Constructor_01 k = new Constructor_01(65,56.5f);
	}

}
