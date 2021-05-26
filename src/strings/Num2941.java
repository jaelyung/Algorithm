package strings;

import java.util.Scanner;

public class Num2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		input = input.replace("c=", "c");
		input = input.replace("c-", "c");
		input = input.replace("dz=", "c");
		input = input.replace("d-", "c");
		input = input.replace("lj", "c");
		input = input.replace("nj", "c");
		input = input.replace("s=", "c");
		input = input.replace("z=", "c");
		
		System.out.println(input.length());
		

	}

}
