

class factorial{
	
	static int fact(int a ){
	
		int multi = 1;

		for(int i = 1; i<= a; i++){
			multi *= i;
		}
		return multi;
	}

	public static void main(String[] args){

		System.out.println(fact(5));
	}
}
