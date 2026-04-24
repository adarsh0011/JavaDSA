
class paliString{

	static boolean pal(String s){

		char[] arr = s.toCharArray();

		int i = 0;
		int j = arr.length - 1;

		while(i<j){

			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i++;
			j--;
		}
		String a = new String(arr);

		if(s.equals(a)){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args){

		String s = "abcdcba";

		System.out.println(pal(s));
	}
}
