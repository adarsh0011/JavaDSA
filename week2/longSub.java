import java.util.*;

class longSub{

	static int longestSub(String s){

		HashMap<Character, Integer> map = new HashMap<>();

		int maxLength = 0;
		int left = 0;

		for(int i = 0; i<s.length(); i++){

			char comp = s.charAt(i);
			if(map.containsKey(comp) && map.get(comp) >= left){

				left = map.get(comp)+1;
			}
			map.put(comp, i);

			int currentLength = i - left + 1;
			maxLength = Math.max(currentLength, maxLength);
		}
		return maxLength;
	}
	public static void main(String[] args){
		String s = "abcabba";

		System.out.println(longestSub(s));
	}
}
