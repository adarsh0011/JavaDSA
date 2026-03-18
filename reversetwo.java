import java.util.Arrays;

public class reversetwo{

	public static void main(String[] args){
		int[] arr = {1, 32, 53, 5, 23, 355, 34, 35};

		reverse(arr);

		System.out.println(Arrays.toString(arr));
	}

	static void reverse(int[] arr){

		int start = 0;
		int end = arr.length - 1;

		for(int i = start; i<= end; i++){
			swap(arr, start, end);
			start++;
			end--;
		}

	}
	static void swap(int[] arr, int index1, int index2){

		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
