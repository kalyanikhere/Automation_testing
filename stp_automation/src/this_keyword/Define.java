package this_keyword;

public class Define extends Name{

	int a = 50;
	static float g = 12.6f;
	String d = "manual";

	public void search() {
		System.out.println(this.a);
		System.out.println(this.d);
		System.out.println(this.g);
		System.out.println("search functionality");
	}

	public void write() {
		this.search();
		this.function();
		System.out.println(this.b);
		System.out.println("write the value");
}
	
	public static void main(String[] args) {
		Define h = new Define();
	h.write();
	}

}
