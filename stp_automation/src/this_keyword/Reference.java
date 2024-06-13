package this_keyword;

public class Reference extends Team{

	String j= "API";
	int s = 50;
	static double d= 60.8;
	
	public void values () {
		System.out.println(this.j);
		System.out.println(this.s);
		System.out.println(this.d);
		System.out.println("print the values");
	}
	
	public void handle () {
		this.roll_no();
		System.out.println(this.a);
		this.values();
		System.out.println("handle the functionality");
	}
	public static void main(String[] args) {
		Reference k = new Reference();
		k.values();


	}

}
