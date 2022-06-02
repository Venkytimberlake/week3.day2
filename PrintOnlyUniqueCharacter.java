package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacter {
	
	public static String name = "babu";
	public static Set<Character> uniqueSet = new LinkedHashSet<Character>();

	public char[] stringToCharArr(String input) {
		char[] charArray = input.toCharArray();
		return charArray;}

	public Set<Character> Unique(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {
			if (!(uniqueSet.contains(charArray[i]))) {
				uniqueSet.add(charArray[i]);
			} else
				uniqueSet.remove(charArray[i]);
		}
		return uniqueSet;
	}

	public static void main(String[] args) {

		PrintOnlyUniqueCharacter same = new PrintOnlyUniqueCharacter();

		uniqueSet = same.Unique(same.stringToCharArr(name));
		System.out.println(uniqueSet);


	}  
       
}  
    
	

	

