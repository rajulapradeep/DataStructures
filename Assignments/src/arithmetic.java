
public class arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Addition "+addNumbers(10,10));
		System.out.println("Subtraction "+subtractNumbers(10,10));
		System.out.println("Multiplication "+mutltiplyNumbers(10,10));
		System.out.println("Division "+divideNumbers(10,10));
	}
	public static int addNumbers(int a, int b){
		return a+b;
	}
	public static int subtractNumbers(int a, int b){
		return a-b;
	}
	public static int mutltiplyNumbers(int a, int b){
		return a*b;
	}
	public static int divideNumbers(int a, int b){
		return a/b;
	}
}
