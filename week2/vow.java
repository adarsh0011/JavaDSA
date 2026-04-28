

class vow{

	static int vowels(String s){

		int count = 0;
		for(int i = 0; i<s.length(); i++){

			char a = s.charAt(i);
			if( a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args){

		String s = "adarsh";

		System.out.println(vowels(s));
	}
}
