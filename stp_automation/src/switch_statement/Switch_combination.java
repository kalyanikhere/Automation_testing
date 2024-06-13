
package switch_statement;

public class Switch_combination {

	public static void main(String[] args) {
		int day_no = 5;
       String days = null ;
       
       switch (day_no) {   
	case 1:
		days ="monday";
		break;
	case 2:
		days ="tuesday";
		break;
	case 3:
		days ="wednesday";
		break;
	case 4:
		days ="thursday";
		break;
	case 5:
		days ="friday";
		break; 
	case 6:
		days ="saturday";
		break;
	case 7:
		days ="sunday";
		break;
		
	default:
		System.out.println("none of the days are present");
		break;
	}   System.out.println("5th day is: "+days);	
	
	}

}
