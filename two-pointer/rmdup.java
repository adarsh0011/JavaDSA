import java.util.Arrays;

public class rmdup{

	public static void main(String[] args){

		int[] arr = {1,1,2,2,3};

		int left = 0;
		

		for(int right = 0; right < arr.length; right++){
			if(arr[left] != arr[right]){
				left++;
				arr[left] = arr[right];
			}
		}
		System.out.println( left + 1);
	}
}
