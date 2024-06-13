package inheritance;

public class Child_class extends Parent_classs {

	public static void get() {
		System.out.println("get the value");
	}
	
	public static void main(String[] args) {
		Child_class cl = new Child_class();
   cl.click();
   System.out.println(cl.b);
   get();

	}

}
