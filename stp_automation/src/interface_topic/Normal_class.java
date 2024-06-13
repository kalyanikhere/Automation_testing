package interface_topic;

public class Normal_class implements Interface_01, Interface_2{

	
	public static void main(String[] args) {
		Normal_class h = new Normal_class();
		h.fuction();
		h.fail();
	System.out.println(h.a);
	System.out.println(h.g);
	System.out.println(h.k);
	}
	
	@Override
	public void fuction() {
System.out.println("search");

		
	}

	@Override
	public void fail() {
 System.out.println("fail to find defect");

	}

	

}
