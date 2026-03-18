import java.util.Arrays;

public class counteven{

	public static void main(String[] args){

		int[] arr = {23, 20, 15, 10, 24, 44};


		System.out.println(even(arr));

	}
	static int even(int[] arr){

		int count = 0;

		for(int i = 0; i< arr.length; i++){
			if(arr[i] % 2 == 0){
				count++;
			}
		}
		return count;
	}
}
