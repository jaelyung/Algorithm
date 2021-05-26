package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num1157 {

	public static void main(String[] args) throws IOException {
		//¹æ¹ý 1. ¸Þ¸ð¸® ÃÊ°ú
		/*
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
		*/
		
		//¹æ¹ý2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		String s = br.readLine();
		
		for(int i=0; i<s.length(); i++) {
			if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i)-97]++;
			} else {
				arr[s.charAt(i)-65]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int i=0; i<26; i++) {
			
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i+65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
		
	}

} 
