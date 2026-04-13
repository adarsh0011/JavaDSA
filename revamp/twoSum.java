public class twoSum{
	public static void main(String[] args){
		
		int[] arr = {2,3,8,1};
		int k =10;
		
		boolean result = sumTwo(arr, k);
		System.out.println(result);			
	}
	public static boolean sumTwo(int[] arr, int k){
		
		for(int i = 0; i< arr.length; i++){
			for (int j = i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == k){
					return true;
				}
			}
		}
		return false;
	}
}
