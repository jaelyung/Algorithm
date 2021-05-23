package strings;

import java.util.Scanner;

public class Num2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		
		
		StringBuffer sb = new StringBuffer(input);
		String reversedStr = sb.reverse().toString();
		
		String[] temp = reversedStr.split(" "); 
		
		if(Integer.parseInt(temp[0])>Integer.parseInt(temp[1])) {
			System.out.println(temp[0]);
		} else {
			System.out.println(temp[1]);
		}
		
	}

}
