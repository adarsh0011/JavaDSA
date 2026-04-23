import java.util.*;
class retwosum{

	static int[] twoSum(int[] arr, int k){

		
		HashMap <Integer, Integer> map = new HashMap<>();

		for(int i = 0; i<arr.length; i++){
			int comp = k - arr[i];
			if(map.containsKey(comp)){
				return new int[] {map.get(comp), i};
			}
			map.put(arr[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] args){
		retwosum sum = new retwosum();
		int[] arr = {1, 2, 3, 4};
		int k = 7;

		int[] result = retwosum.twoSum(arr, k);
		System.out.println(Arrays.toString(result));
	}
}
