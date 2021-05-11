package MinAndMax;

import java.util.Scanner;

public class Num8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = Integer.parseInt(sc.nextLine());
		String[] testCase = new String[caseCnt];
		int[] score = new int[caseCnt];
		int count = 0;
		
		for(int i=0; i<caseCnt; i++) {
			testCase[i] = sc.nextLine();
		}
		
		for(int i=0; i<caseCnt; i++) {
			count = 0;
			for(int j=0; j<testCase[i].length(); j++) {
				if(testCase[i].charAt(j) == 'O') {
					count=count+1;
					
				}else if(testCase[i].charAt(j) == 'X') {
					count = 0;
				}
				score[i] = score[i] + count;
			}
			System.out.println(score[i]);
		}

	}

}
