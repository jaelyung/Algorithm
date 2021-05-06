package MinAndMax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Num3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		//처음에 생각했던 것 
//		int[] input = new int[10];
//		int[] value = new int[input.length];
//		int count = 1;
//		
//		for(int i=0; i<input.length; i++) {
//			input[i] = sc.nextInt();
//		}
//		
//		for(int i=0; i<input.length; i++) {
//			value[i] = input[i] % 42;
//			for(int j=i+1; j<value.length; j++) {
//				if(value[j] != value[i]) {
//					count++;
//				}
//			}
//		}
//		
//		System.out.println(count);
		
		//블로그참고
		
		boolean[] arr = new boolean[42];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}
		
		int count = 0;
		for(boolean value: arr) {
			if(value) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
