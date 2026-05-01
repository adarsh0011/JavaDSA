import java.util.*;

class twoSum{

	static void sum(int[] nums, int target) {

		for(int i = 0; i<nums.length; i++){
			for(int j = i; j< nums.length; j++){

				int sum = nums[i] + nums[j];
				if(sum == target){

					System.out.println( i + " " + j);
				}
			}
		}
	}
	public static void main(String[] args){

		int[] nums = {1, 7, 2, 15};

		int target = 9;

		sum(nums, target);
	}
}
