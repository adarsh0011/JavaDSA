
class subArray{

	static int maxSub(int[] arr, int k){

		int left = 0;
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for(int right = 0; right<arr.length; right++){

			currentSum += arr[right];
			if(right - left + 1 == k){
				maxSum = Math.max(maxSum, currentSum);
				currentSum -= arr[left];
				left++;
			}
		}
		return maxSum;
	}
	public static void main(String[] args){

		int[] arr = {100, 200, 300, 400};
		int k = 2;

		System.out.println(maxSub(arr, k));
	}
}

