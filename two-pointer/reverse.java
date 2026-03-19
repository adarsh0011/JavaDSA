import java.util.Arrays;

public class reverse{
	public static void main(String[] args){

		int[] arr = {12, 24, 5, 1, 48};
		reverse(arr);
		System.out.println(Arrays.toString(arr));


	}
	static void reverse(int[] arr){

		int left = 0;
		int right = arr.length-1;
		
		while(left<right){

			swap(arr, left, right);
			left++;
			right--;
		}
	}
	static void swap(int[] arr, int index1, int index2){
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
