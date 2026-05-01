

class countFreq{

	static void freq(String s){

		boolean printed[] = new boolean[s.length()];

			for(int i = 0; i<s.length(); i++){

				if(printed[i]) continue;
				
				int count = 0;
				for(int j = i; j<s.length(); j++){

					if(s.charAt(i) == s.charAt(j)){

						count++;
						printed[j] = true;
					}
				}
				System.out.println(s.charAt(i) + " " + count); 
			}
	}
	public static void main(String[] args){

		String s = "adarsh";

		freq(s);
	}
}
