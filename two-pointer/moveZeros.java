import java.util.Arrays;

public class moveZeros{
	
	public static void main(String[] args){

		int[] arr = {0,323,0,1,0,5};

		move(arr);
		System.out.println(Arrays.toString(arr));
	
	}

	static void move(int[] arr){

		int start = 0;

		for(int end = 0; end < arr.length; end++){
			if (arr[end] != 0){
				swap(arr, start, end);
				start++;
			}
		}
	}

	static void swap(int[] arr, int index1, int index2){

		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

	}
}
