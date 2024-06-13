package encapsulation;

public class Search_fuctionality {

	String product = "details";
	
	private void search(String h) {
		product = h;
		System.out.println(h);
	}
	
	public static void main(String[] args) {
		Search_fuctionality k = new Search_fuctionality();
		k.search("****");

	}

}
