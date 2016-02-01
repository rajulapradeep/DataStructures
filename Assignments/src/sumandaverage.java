
public class sumandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getSum(0,3);
	}
	public static void getSum(int lower, int upper){
		int sum = 0;
		int count = 0;
		for(int i=lower; i<=upper;i++){
			sum = sum + i;
			count++;
		}
		int average = sum /count;
		System.out.println("Sum is "+sum);
		System.out.println("Average is "+average);
	}
}
