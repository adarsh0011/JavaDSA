import java.io.*;
import java.util.*;

class vowels{

	public static void main(String[] args){

		String name = "Adarsh";
		int count = 0;
		char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};

		for(int i = 0; i<name.length(); i++){
			char c = name.charAt(i);
			for(int j = 0; j<vowels.length; j++){

				if (c == vowels[j]){
					count ++;
				break;
			}
		}
	}
	System.out.println(name + count);
}
}
