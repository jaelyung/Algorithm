package strings;

import java.util.Scanner;

public class Num5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		//(j+1)String[] temp = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		String[] temp = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		String[] charInput = input.split("");
		int count = 0;
		
		for(int i=0; i<charInput.length; i++) {
			for(int j=0; j<temp.length; j++) {
				if(temp[j].contains(charInput[i])) {
					count = count + (j+3);
				}
			}
		}
		
		System.out.println(count);

	}

}
