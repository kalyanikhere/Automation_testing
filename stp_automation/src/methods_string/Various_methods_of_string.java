package methods_string;

public class Various_methods_of_string {

	public static void main(String[] args) {
//	empty method 
		String a = "function testing";
		System.out.println("output of empty method is : "+a.isEmpty());
		System.out.println("-------------------------------- ");
		
//	length method
		System.out.println("output of length method is : "+a.length());
		System.out.println("-------------------------------- ");
		
//	replace method
		System.out.println("output of replace method is : "+a.replace("tion", "tionality"));
		System.out.println("-------------------------------- ");
		
//	index of method
		System.out.println("output of index_of method is : "+a.indexOf("o"));	
		System.out.println("-------------------------------- ");
		
//	char at method
		System.out.println("output of char At method is : "+a.charAt(10));
		System.out.println("-------------------------------- ");
		
//	substring method
		String b = "backend testing";
		System.out.println("output of substring method is : "+b.substring(8));
		System.out.println("output of substring method is : "+b.substring(0, 7));
		System.out.println("-------------------------------- ");
		
//	concat method	
		String c = "API";
		System.out.println("output of concat method is : "+c.concat(" testing"));
		System.out.println("-------------------------------- ");
		
//	 lower case method	
		System.out.println("output of lowercase method is : "+c.toLowerCase());
		System.out.println("-------------------------------- ");
		
//		upper case method
		String d = "manual";
		System.out.println("output of lowercase method is : "+d.toUpperCase());
		System.out.println("-------------------------------- ");
	
//	contains
		System.out.println("output of contains method is : "+b.contains("backend"));
		System.out.println("-------------------------------- ");
		
//	equals method
	    String expected = "service level testing";
	    String actual = "service testing";
	    System.out.println("output of equals method is : "+expected.equals("atual"));
	    System.out.println("-------------------------------- ");
		
	    String h = "calculation based testing";
	    String k = "calculation based testing";
	    System.out.println("output of equals method is : "+h.equals(k));
	    System.out.println("-------------------------------- ");
		
//	equal ignore case	
	    String expected_1 = "level";
	    String actual_1 = "Level";
	    System.out.println("output of equalsignore method is : "+expected_1.equalsIgnoreCase("atual_1"));
	    System.out.println("-------------------------------- ");
		
//		endswith method
	   
	    System.out.println("output of endswith method is : "+h.endsWith("testing"));
	    System.out.println("-------------------------------- ");
		
//	trim method
	    String g = "   mobile    ";
	    System.out.println("output of trim method is : "+g.trim());
		
	}

}
