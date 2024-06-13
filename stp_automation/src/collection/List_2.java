package collection;

import java.util.LinkedList;

public class List_2 {

	public static void main(String[] args) {

    LinkedList<Integer> no = new  LinkedList<Integer> ();
    
    no.add(0, null);
    no.add(1, 90);
    no.add(2, 80);
    no.add(3, 70);
    no.add(4, 50);
    System.out.println(no);
    System.out.println(no.clone());
    System.out.println(no.reversed());
    System.out.println(no.contains(50));
    System.out.println(no.isEmpty());
    no.remove(3);
    System.out.println(no);
    System.out.println(no.size());
    System.out.println(no.pollFirst());
    System.out.println(no.pollLast());
    System.out.println("-------------------------------------------------------------------");
    System.out.println(no.peekFirst());
    System.out.println(no.peekLast());
    no.clear();
   no.removeFirst();
   no.removeLast();
    
    
    
    
	}

}
