import java.util.*;
class substring{

	static int LongestSub(String s){

		int left = 0;
		int maxLength = 0;

		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i<s.length(); i++){

			char comp = s.charAt(i);
			if(map.containsKey(comp) && map.get(comp) >= left){

				left = Math.max(left, map.get(comp) + 1);
			}
			map.put(comp, i );

			int currentLength = i - left + 1;
			maxLength = Math.max(maxLength, currentLength);

		}
		return maxLength;
	}

	public static void main(String[] args){

		String s = "abcbacbb";

		System.out.println(LongestSub(s));
	}
}

