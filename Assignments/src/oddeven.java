import java.util.Scanner;

public class oddeven {

		
		String result;
		oddeven(int number){
			if(number % 2 == 0){
				result = "Even";
			}else{
				result = "Odd";
			}
		}
		void display(){
			System.out.println(result);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner keyboard = new Scanner(System.in);
		    System.out.print("Please enter number1: ");
		    int n1 = keyboard.nextInt();  // local variable
		    System.out.print("Please enter vumber2: " );
		    int n2 = keyboard.nextInt();  // another local variable
		    keyboard.nextLine();  // to handle the end of line characters
		    oddeven s1 = new oddeven(n1);  
		    oddeven s2 = new oddeven(n2);  
		    s1.display();  
		    s2.display(); 
		    
			}
		

}
