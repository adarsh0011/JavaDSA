import java.util.*;

class countFreq{

	static void count(String s){

		HashMap<Character, Integer> map = new HashMap<>();

			for(int i = 0; i<s.length(); i++){

				char frequency = s.charAt(i);

				if(map.containsKey(frequency)){

					int count = map.get(frequency) + 1;
					map.put(frequency, count);
				}else{
					map.put(frequency, 1);
				}
			}

			for(Map.Entry<Character, Integer> entry: map.entrySet()){
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
	}
	public static void main(String[] args){

		String s = "geeksforgeek";

		count(s);
	}
}
