import java.util.Arrays;

public class dup{
	public static void main(String[] args){
		
		int[] arr = {0, 4, 1, 5, 2};
		
		boolean result = containsDup(arr);
		System.out.println(result);
	}
	
	public static boolean containsDup(int[] arr){
		for(int i = 0; i<arr.length; i++){
                        for(int j = i+1; j<arr.length; j++){
                                if(arr[i] == arr[j]){
                                        return true;
                                }
                        }
                }
                return false;
	}
}
