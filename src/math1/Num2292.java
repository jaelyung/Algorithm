package math1;

import java.util.Scanner;

public class Num2292 {

	public static void main(String[] args) {
		//벌집 1, 7, 19, 37
		// 1+(6*1)+(6*2)...
		//등차수열
		//sum = sum + (6*n);
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		boolean flag = true;
		int n = 0;
		int sum = 1;
		
		while(flag) {
			sum = sum + 6*n;
			n++;
			if(input<=sum) {
				flag = false;
				//break;
			}
			
		}
		
		System.out.println(n);
		
	}

}
