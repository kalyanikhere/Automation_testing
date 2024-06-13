package polymorphism;

public class methoid_overloading {

	public void detect() {
		System.out.println("instance method with no parameter");
	}
	
public void detect(int a) {
	System.out.println("instance method with  int parameter");
	}
	
public void detect(float f) {
	System.out.println("instance method with float parameter");
}	
	
public void detect(float h,long d) {
	System.out.println("instance method with multiple parameter");
}
	public static void main(String[] args) {
		methoid_overloading k = new methoid_overloading();
		k.detect();
		k.detect(5.6f);
		k.detect(9);
		k.detect(9.5f, 6);
		
	
	}

}
