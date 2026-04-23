
class largestEle{

	static int maxElement(int[] arr){

		int a = 0;

		for(int i = 0; i<arr.length; i++){

			if(arr[i] > a){
				a = arr[i];
			}
		}
		return a;
	}
	public static void main(String[] args){

		int[] arr = {10, 20, 2434};

		System.out.println(maxElement(arr));

	}
}
