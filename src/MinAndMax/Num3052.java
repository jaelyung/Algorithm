package MinAndMax;

import java.util.Scanner;

public class Num3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		int[] value = new int[input.length];
		int count = 1;
		
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		for(int i=0; i<input.length; i++) {
			value[i] = input[i] % 42;
			for(int j=i+1; j<value.length; j++) {
				if(value[j] != value[i]) {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}
