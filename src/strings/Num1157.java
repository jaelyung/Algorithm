package strings;

import java.util.Scanner;

public class Num1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int[] alpha = new int[26];
		
		for(int i=0; i<input.length(); i++) {
			char letter = input.toLowerCase().charAt(i);
			
			alpha[letter - 'a']++;
			
		}
		
		char maxLetter = 'a';
		int max = 0;
		int count = 0;
		
		for(int i=0; i<26; i++) {
			
			if(alpha[i] > max) {
				max = alpha[i];
				maxLetter = (char)(i + 'a' - 32);
				count = 0;
			} else if(alpha[i] == max) {
				count++;
			}
		}
		
		if(count>0) {
			maxLetter='?';
		}
		
		System.out.println(maxLetter);
		
	}

}
