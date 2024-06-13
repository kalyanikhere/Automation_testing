package polymorphism;

public class Child_1 extends Parent_1{

	public void develop() {
		System.out.println("develop method from child_1");
	}
	
	public static void main(String[] args) {
		
//		child class object
		Child_1 h = new Child_1();
		h.develop();
		  System.out.println("----------------------------------------------------");
		
//    as per the 3rd property of inheritance
		Parent_1 p = new Child_1();
		p.develop();
		System.out.println("----------------------------------------------------------");
		
//		has a relationship
		Parent_1 s = new Parent_1();
		s.develop();
		
		
	}

}
