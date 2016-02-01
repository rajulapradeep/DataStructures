
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumberInWord(1);
		printNumberInWord(2);
		printNumberInWord(3);
		printNumberInWord(4);
	}
	public static void printNumberInWord(int number){
		switch(number){
			case 1:
				System.out.println("One"); 
            	break;
            case 2:
				System.out.println("Two"); 
            	break;
            case 3:
				System.out.println("Three"); 
            	break;
            case 4:
				System.out.println("Four"); 
            	break;
            case 5:
				System.out.println("Five"); 
            	break;
            default :
				System.out.println("Invalid"); 
            	break;
		}
 
	}
}
