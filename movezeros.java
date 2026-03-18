import java.util.Arrays;

public class movezeros{

	public static void main(String[] args){
		int[] arr = {0, 23, 4, 0, 54, 0, 3};

		move(arr);
		System.out.println(Arrays.toString(arr));

	}

	static void move(int[] arr){
		
		int left = 0;

		for(int right = 0; right< arr.length; right++){

			if( arr[right] != 0){
				swap(arr, left, right);
				left++;
				
			}
		}
	}

	static void swap(int[] arr, int index1, int index2){

		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
