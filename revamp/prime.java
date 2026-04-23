
class prime{

	static boolean checkPrime(int n ){


		for(int i = 2; i<= n-1; i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args){

		int n = 5;

		System.out.println(checkPrime(n));
	}
}
