package math1;

import java.util.Scanner;

public class Num1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int cross_count = 1, prev_count_sum = 0;
		
		while(true) {
			
			if(n <= prev_count_sum + cross_count) {
				
				if(cross_count % 2 == 1) {
					System.out.println((cross_count - (n - prev_count_sum -1)) + "/");
				}
			}
		}
		
		

		
		
	}

}
