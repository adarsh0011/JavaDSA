
class sumSubarray{

	static void sumSub(int[] arr){

		int total = 0;

		for(int i = 0; i<arr.length; i++){

			int sum = 0;
			for(int j = i; j<arr.length; j++){

				sum += arr[j];
				total += sum;
			}
		}
		System.out.println(total);
	}

	public static void main(String[] args){

		int[] arr = {1, 2, 3, 4, 5, 6};

		sumSub(arr);
	}
}

