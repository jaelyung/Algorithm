package math1;

import java.util.Scanner;

public class Num1712 {

	public static void main(String[] args) {
		// a만원 고정비용 b만원의 가변비용
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 1;
		
		//c*1 c*2 c*3 ...
		//a+b a+2b a+3b a+4b
		//(a+b) < (c*1)
		
//		do {
//			++count;
//		}while(a+(count*b) > (c*count));
//		
//		System.out.println(count);

	}

}
