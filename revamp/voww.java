
class voww{

	static int vowel(String s){

		int count = 0;

		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);

			if( c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i'){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){

		String s = "adarsh";

		System.out.println(vowel(s));
	}
}

