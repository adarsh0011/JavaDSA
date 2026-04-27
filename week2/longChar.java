import java.util.*;

class longChar{

	static int longSub(String s){

	HashMap<Character, Integer> map = new HashMap<>();

		int left = 0;
		int maxLength = 0;

		for(int i = 0; i<s.length(); i++){

			char comp = s.charAt(i);

			if(map.containsKey(comp) && map.get(comp) >= left){
				left = map.get(comp) + 1;

			}
			map.put(comp, i);
			int currentLength = i - left + 1;
			maxLength = Math.max(currentLength, maxLength);
		}
		return maxLength;
	}
	public static void main(String[] args){

		String s = "abcbba";

		System.out.println(longSub(s));

	}
}
