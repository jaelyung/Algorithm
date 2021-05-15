package strings;

import java.util.Scanner;

public class Num11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine().substring(0, number);
		
		String[] temp = input.split("");
		int sum = 0;
		for(int i=0; i<temp.length; i++) {
			sum = sum + Integer.parseInt(temp[i]);
		}
		System.out.println(sum);
	}

}
