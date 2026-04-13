import java.util.*;

class twoS{
	public int[] twoSum(int[] arr, int k){

	Map<Integer, Integer> map = new HashMap<>();

	for(int i = 0; i< arr.length; i++){

		int complement = k - arr[i];
		if(map.containsKey(complement)){
			return new int[] {map.get(complement), i};
		}
		map.put(arr[i], i);
	}
	return new int[] {};
	}


	public static void main(String[] args){
	
	twoS twosum = new twoS();
	int[] arr = {2, 5, 12, 14};
	int k = 9;

	int[] result = twosum.twoSum(arr, k);
	
	System.out.println(Arrays.toString(result));

	}
}
