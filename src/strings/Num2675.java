package strings;

import java.util.Scanner;

public class Num2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<testCase; i++){ 				
			
			int num = sc.nextInt();
			String str = sc.next();
			
			for(int j=0; j<str.length(); j++){ 
				for(int k=0; k<num; k++){		
					System.out.print(str.charAt(j));
				}
			}
		}
		System.out.println();

	}

}
