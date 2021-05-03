package MinAndMax;

import java.util.Scanner;

public class Num2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[3];
		int number = 0;
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		
		//¼ıÀÚ 3°³ input
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		number = input[0] * input[1] * input[2];
		
		String temp = Integer.toString(number);
		String[] numArr = temp.split("");
		
		for(int i=0; i<numArr.length; i++) {
			for(int j=0; j<=9; j++) {
				switch(Integer.parseInt(numArr[i])) {
					case 0:
						count[0]++;
						break;
					case 1:
						count[1]++;
						break;
					case 2:
						count[2]++;
						break;
					case 3:
						count[3]++;
						break;
					case 4:
						count[4]++;
						break;
					case 5:
						count[5]++;
						break;
					case 6:
						count[6]++;
						break;
					case 7:
						count[7]++;
						break;
					case 8:
						count[8]++;
						break;
					case 9:
						count[9]++;
						break;
				}
			}
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}

	}

}
