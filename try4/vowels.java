import java.util.*;

class vowels{

	static int vowel(String s){

		int count = 0;

		for(int i = 0; i<s.length(); i++){

			char a = s.charAt(i);

			if(a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U'){
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args){

		String s = "adarsh";

		System.out.println(vowel(s));
	}
}
