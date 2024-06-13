package date_class;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_class01 {

	public static void main(String[] args) {
		
//      system's time
		
		Date g = new Date();
		System.out.println(g.toString());
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		
//	    customize time by requirements
		
		SimpleDateFormat f = new SimpleDateFormat ("dd-MM-dd hh:mm:ss");
		System.out.println(f.format(g));
		System.out.println("---------------------------------------------------");
		System.out.println();
		
//	    customize time by requirements
		
		SimpleDateFormat f1 = new SimpleDateFormat ("dd-MM-dd");
		System.out.println(f1.format(g));
		System.out.println("---------------------------------------------------");
		System.out.println();
		
//	    customize time by requirements
		
		SimpleDateFormat f2 = new SimpleDateFormat ("hh:mm:ss");
		System.out.println(f2.format(g));
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		
	}

}
