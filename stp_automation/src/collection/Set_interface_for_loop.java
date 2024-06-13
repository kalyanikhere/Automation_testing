package collection;

import java.util.LinkedHashSet;

public class Set_interface_for_loop {

	

	public static void main(String[] args) {
   
     LinkedHashSet<Float> h = new  LinkedHashSet<Float> ();
     
    for (float a= 1; a<=10; a++) {
    	h.add(a);
    }
//    to print all values
    System.out.println(h);
	}

}
