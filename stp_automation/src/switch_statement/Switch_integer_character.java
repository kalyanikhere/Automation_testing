package switch_statement;

public class Switch_integer_character {

	public static void main(String[] args) {
		
//		switch for integer value
		int a = 4;
		
	switch (a) {
	case 1:
		System.out.println("value of a is 1");
		break;
	case 2:
		System.out.println("value of a is 2");
		break;
	case 3:
		System.out.println("value of a is 3");
		break;
	case 4:
		System.out.println("value of a is 4");
		break;
	case 5:
		System.out.println("value of a is 5");
		break;

	default:
		System.out.println("none of the value of a present");
		break;
	}   System.out.println("---------------------------------------------------");	
		
	int b = 5;
	
	switch (b) {
	case 1:
		System.out.println("value of b is 1");
		break;
	case 2:
		System.out.println("value of b is 2");
		break;
	case 3:
		System.out.println("value of b is 3");
		break;

	default:
		System.out.println("none of the value of b present");
		break;
	}	System.out.println("---------------------------------------------------");	
	
	
	
//	switch for characters
	
	char consonant = 'h'; 
	
	switch (consonant) {
	case 'b':
		System.out.println("value of consonant is b");
		break;
	case 'd':
		System.out.println("value of consonant is d");
		break;                       
	case 'f':
		System.out.println("value of consonant is f");
		break;
	case 'h':
		System.out.println("value of consonant is h");
		break;
		
	default:
		System.out.println("none of the value of consonant is present");
		break;
	}   System.out.println("---------------------------------------------------");	
		
		
char consonants = 'k'; 
	
	switch (consonants) {
	case 'b':
		System.out.println("value of consonant is b");
		break;
	case 'd':
		System.out.println("value of consonant is d");
		break;
	case 'f':
		System.out.println("value of consonant is f");
		break;
	case 'h':
		System.out.println("value of consonant is h");
		break;
		
	default:
		System.out.println("none of the value of consonants are present");
		break;
	}   System.out.println("---------------------------------------------------");	
				

	}

}
