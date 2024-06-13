package collection;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {

     ArrayList<String> values = new ArrayList<String> ();
     
		values.add("manual testing");
		values.add("backend testing");
		values.add("manual testing");
		values.add("API testing");
		values.add("mobile testing");
		values.add("automation testing");
		values.add(null);
		
		
		System.out.println(values);
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println(values.reversed());
		System.out.println("------------------------------------------------------------------------------------------");
	
		values.add(2, "fuctional testing");
	System.out.println(values);
		
		System.out.println("------------------------------------------------------------------------------------------");
       
		System.out.println(values.clone());
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(values.contains("mobile testing"));
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println(values.isEmpty());
		
		System.out.println("------------------------------------------------------------------------------------------");
		values.remove(1);
		System.out.println(values);
		
		System.out.println("------------------------------------------------------------------------------------------");
	    System.out.println(values.removeFirst());
	    System.out.println(values.removeLast());
	
	
	
	}

}
