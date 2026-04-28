import java.util.*;

class string{

	static void trav(String s){

		for(int i = 0; i<s.length(); i++){

			System.out.println(s.charAt(i));
		}
	}
	public static void main(String[] args){

		String s = "adarsh";

		trav(s);
	}
}
