import java.util.*;	
class prefix{

	static int[] prefixSum(int[] arr){

		int[] prefix = new int[arr.length];
		int sum = 0;

		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
			prefix[i] = sum;
		}
		return prefix;
	}
	public static void main(String[] args){

		int[] arr = {10, 20 , 10, 15};

		System.out.println(Arrays.toString(prefixSum(arr)));
	}
}
