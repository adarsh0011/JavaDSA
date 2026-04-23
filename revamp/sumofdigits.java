
class sumofdigits{

	static int getSum(int n){

		int sum = 0;

		while(n>0){
			int digit = n%10;
			sum += digit;
			n = n/10;
		}
		return sum;
	}
	public static void main(String[] args){

		int n = 1323;

		System.out.println(getSum(n));
	}
}
