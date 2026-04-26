

class vowels{

	static int vowel(String s){

		int count = 0;

		for(int i = 0; i<s.length(); i++){

			char x = s.charAt(i);
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
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
