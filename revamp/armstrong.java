
class armstrong{

	static boolean checkArmstrong(int n ){

	int original = n;
	int size = String.valueOf(n).length();
	int sum = 0;

	while(n > 0){
		int digit = n % 10;
		sum += Math.pow(digit, size);
		n = n/10;
	}
	if (sum == original){
		return true;
	}else{ 
		return false;
	}
	}
	public static void main(String[] args){ 
		int n = 153;

		System.out.println(checkArmstrong(n));
	}
}
