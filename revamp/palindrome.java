
class palindrome{

	static boolean pali(int[] arr){
		
		int i = 0;
		int j = arr.length -1;

		while(i<j){
			if(arr[i] != arr[j]){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args){

	int[] arr = {1,3,2,1};
	System.out.println(pali(arr));

	}
}
