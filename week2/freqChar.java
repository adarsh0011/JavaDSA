

class freqChar{

	static String frequency(String s){

		boolean printed[] = new boolean[s.length()];
		
		String result  = " ";
		for(int i = 0; i<s.length(); i++){

			if(printed[i]) continue;
			
			char ch = s.charAt(i);
			int count = 0;
			for(int j = i; j<s.length(); j++){
				if(ch == s.charAt(j)){
					count++;
					printed[j] = true;
				}
			}
			result += ch + " " + count + " ";
		}
		return result;
	}
	public static void main(String[] args){

		String s = "adarsh";

		System.out.println(frequency(s));
	}
}
