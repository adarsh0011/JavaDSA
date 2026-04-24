
class vow{

	static int vowels(String s){

		char[] arr = {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};

		int count = 0;

		for(int i = 0; i<s.length(); i++){

			char comp = s.charAt(i);

			for(int j =0; j<arr.length; j++){
				if(arr[j] == comp){
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args){

		String s = "Adarsh";

		System.out.println(vowels(s));

	}
}
