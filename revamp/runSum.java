import java.util.*;

class runSum{

	static int[] runSub(int[] arr){

		int[] prefixSum = new int[arr.length];
		int sum = 0;

		for(int i = 0; i<arr.length; i++){
			sum += arr[i];
			prefixSum[i] = sum;
		}
		return prefixSum;
	}
	public static void main(String[] args){

		int[] arr = {1, 2, 3, 4};

		System.out.println(Arrays.toString(runSub(arr)));
	}
}
