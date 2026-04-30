import java.util.*;

class charFreq{

	static void freq(String s){ 

	HashMap<Character, Integer> map = new HashMap<>();

		for(int i = 0; i<s.length(); i++){

			char comp = s.charAt(i);
			
			if(map.containsKey(comp)){

				int count = map.get(comp);
				map.put(comp, count + 1);
			}else{
				map.put(comp, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        	    System.out.println(entry.getKey() + " " + entry.getValue());
       		 }
	}
	public static void main(String[] args){

		String s = "adarsh";

		freq(s);
	}
}
