package return_statement;

public class Return_type {

//	without return type and no parameter 
	public void note() {
		System.out.println("api stands for appication programing interface");
		System.out.println("-------------------------------- ");
	}

//	without return type and with parameter
	public static void search(String k) {
		System.out.println("the value of k is: " + k);
		System.out.println("-------------------------------- ");
	}

//	with return statement and with parameter
	public void get(int b) {
		System.out.println("the value of b is: " + b);
		System.out.println("-------------------------------- ");
		return;
	}

//	with return type and having parameters
	public int put(int l, int m) {
		System.out.println("the value of l is: " + l);
		System.out.println("the value of m is: " + m);
		return l * m;
	}

	public static String delete(String v) {
		return v;
	}
	
	public static void main(String[] args) {
		Return_type h = new Return_type();
		h.note();
		search("funtionality testing");
		h.get(80);
		System.out.println("multiplication of values are : "+h.put(200, 8));
		System.out.println("the value of v is "+"mobile testing");

	}

}
