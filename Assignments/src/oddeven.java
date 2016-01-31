
public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			evaluatenumber(10);
			evaluatenumber(11);
			evaluatenumber(0);
		}
		public static void evaluatenumber(int number){
			if(number % 2 ==0){
				System.out.println("Number is even");
			}
			else{
				System.out.println("Number is odd");
			}
		}

}
