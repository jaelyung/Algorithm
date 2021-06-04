package math1;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("피라미드의 높이를 설정하세요!");
		int height = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<height; i++) {
			int width = (2*i)+1;
			int space = height-(i+1);
			
			for(int j = 0; j<space; j++) System.out.print(" ");
			for(int j = 0; j<width; j++) System.out.print("*");
			System.out.println();
		}
		
		
		
	}

}
