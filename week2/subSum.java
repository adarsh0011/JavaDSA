import java.util.*;

class subSum{

	static  int subsum(int[] arr, int k){

		HashMap<Integer, Integer> map = new HashMap<>();

		map.put(0, 1);

		int sum = 0;
		int count = 0;

		for(int i = 0; i<arr.length; i++){

			sum += arr[i];

			if(map.containsKey(sum - k)){
				count += map.get(sum - k);
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
		}
		return count;
	}
	public static void main(String[] args){

		int[] arr = {1,1,1};
		int k = 2;

		System.out.println(subsum(arr, k));
	}
}
