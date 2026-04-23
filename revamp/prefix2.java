import java.util.*;
class prefix2{

	static int subSum(int[] arr, int k){

		int count = 0;

		for(int i = 0; i<arr.length; i++){
			int sum = 0;

			for(int j = i; j<arr.length; j++){

				sum += arr[j];
				if(sum == k){
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args){

		int[] arr = {1,2,3,4};
		int k = 5;
		
		System.out.println(subSum(arr, k));
	}
}
