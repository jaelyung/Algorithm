package MinAndMax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Num2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		int maxIndex = 1;
		int maxNum = 0;
		
		for(int i = 0 ; i < 9 ; i++) {
			numList.add(sc.nextInt());		
			
		}
		
		maxNum = numList.get(0);
		for(int i = 1 ; i < numList.size() ; i++) {
			if(numList.get(i) > maxNum) {
				maxNum = numList.get(i);
				maxIndex = i+1;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(maxIndex);
	}

}
