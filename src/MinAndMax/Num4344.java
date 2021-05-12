package MinAndMax;

import java.util.Scanner;

public class Num4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = sc.nextInt();
		
		for(int i=0; i<caseCnt; i++) {
			int studentCnt = sc.nextInt();
			int[] students = new int[studentCnt];
			int totalScore = 0;
			
			for(int j=0; j<studentCnt; j++) {
				students[j]=sc.nextInt();
				totalScore = totalScore + students[j];
			}
			double avg = totalScore/studentCnt;
			int overAvgNum = 0;
			
			for(int j=0; j<studentCnt; j++) {
				if(students[j]> avg) {
					overAvgNum++;
				}
			}
			System.out.println((String.format("%.3f", (double)overAvgNum / studentCnt * 100)) + "%");
		}
		
		

	}

}
