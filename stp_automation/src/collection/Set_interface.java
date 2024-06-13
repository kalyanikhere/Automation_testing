package collection;

import java.util.HashSet;
import java.util.LinkedList;

public class Set_interface {

	public static void main(String[] args) {

		HashSet<Character> vowel = new  HashSet<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		System.out.println(vowel);
		System.out.println(vowel.contains('u'));
		System.out.println(vowel.isEmpty());
		vowel.remove('o');
		System.out.println(vowel);
		System.out.println(vowel.clone());
        vowel.clear();
		System.out.println(vowel);
//		here we can not able to use reverse method 
		
		

	}

}
