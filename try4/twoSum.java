import java.util.*;

class twoSum{

	static int[] twosum(int[] nums, int k){

		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i<nums.length; i++){

			int comp = k - nums[i];

			if (map.containsKey(comp)){

				return new int[] {map.get(comp), i};
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] args){

		twoSum sum = new twoSum();
		
		int[] nums = {2, 7, 11, 15};

		int k = 26;

		int[] result = sum.twosum(nums, k);
		System.out.println(Arrays.toString(result));
	}
}
