import java.util.*;

class longChar{

	static int longChara(String s ){

		HashMap<Character, Integer> map = new HashMap<> ();

			int left = 0;
			int maxLength = 0;

			for(int i = 0; i<s.length(); i++){

				char currentChar = s.charAt(i);

				if(map.containsKey(currentChar) && map.get(currentChar) >= left){

					left = map.get(currentChar)+1;

				}
				map.put(currentChar, i);

				int currentLength = i - left + 1;

				maxLength = Math.max(currentLength, maxLength);
			}
			return maxLength;
	}
	public static void main(String[] args){

		String s = "abcbba";

		System.out.println(longChara(s));
	}
}
