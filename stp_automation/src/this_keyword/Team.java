package this_keyword;

public class Team extends Super_keyword{

	int a= 10;
	
	 public void roll_no() {
		 System.out.println(super.a);
		 super.roll_no();
		 System.out.println(this.a);
		 System.out.println("give the roll_no");
	 }
	
	 public Team () {
		 super(45);
		 System.out.println("user define constructor");
	 }
	 
	public static void main(String[] args) {
	Team hk = new Team();
	hk.roll_no();

		


	}

}
