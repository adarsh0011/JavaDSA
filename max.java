import java.util.Arrays;

public class max{
	public static void main(String[] args){
		int[] arr = {1, 23, 354, 535, 2};


		System.out.println(max(arr));
		System.out.println(maxRange(arr, 0, 2));
	}

	public static int max(int[] arr){
		
		int maxVal = 0;
		for(int i = 0; i< arr.length; i++){
			if(arr[i]> maxVal){
				maxVal = arr[i];
			}
		}
		return maxVal;
	}

	static int maxRange(int[] arr, int start, int end){
		
		int maxVal = 0;
		for(int i = start; i<= end; i++){
			if(arr[i]> maxVal){
				maxVal = arr[i];
			}
		}
		return maxVal;
	}
}
