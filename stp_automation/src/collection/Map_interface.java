package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Map_interface {

	public static void main(String[] args) {
//		we can use this ways
//		HashMap<Integer, Integer> student = new HashMap<Integer, Integer> ();
//		HashMap<string, String> student = new HashMap<String, String> ();
		
        HashMap<Integer, String> student = new HashMap<Integer, String> ();
   
   student.put(0, "kalyani");
   student.put(4, "aani");
   student.put(2, "nidhi");
   student.put(5, "kanika");
   student.put(1, "kishori");
   student.put(3, "uday");
   student.put(5, "diya");
   
   System.out.println(student);
  System.out.println(student.size()); 
  System.out.println(student.clone());
  System.out.println(student.isEmpty());
  System.out.println(student.containsKey(4));
  System.out.println(student.containsValue("aani"));
  System.out.println(student.replace(3, "uday"));
  System.out.println(student.replace(5, "kishori", "nisha"));
  System.out.println(student.remove(2, "nidhi"));
 
  // if we want to separate values 
   // k = student.values();
//  Hoer to k and create local variable k
  
 Collection<String> k = student.values();
  System.out.println(k);
  
  // if we want to separate values 
  // d = student.values();
// Hoer to d and create local variable d
  
  Set<Integer> d = student.keySet();
  System.out.println(d);
  
   
	}

}
