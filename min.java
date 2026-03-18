import java.util.Arrays;

public class min{

	public static void main(String[] args){

		int[] arr = {23, 35, 54, 20, 15};

		

		System.out.println(minVal(arr));

	}

	static int minVal(int[] arr){

		int min = arr[0];

		for(int i = 0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	}
}
