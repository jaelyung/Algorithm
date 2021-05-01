package MinAndMax;

import java.util.ArrayList;
import java.util.Scanner;

public class Num10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수의 개수 입력
		int leng = sc.nextInt(); 
		
		ArrayList<Integer> numGroup = new ArrayList<Integer>();
		
		//입력된 정수만큼 반복하며 숫자 입력
		for(int i=0; i<leng; i++) {
			int inputNum = sc.nextInt();
			numGroup.add(inputNum);
		}
		
		//min, max, temp 선언
		int min = numGroup.get(0);
		int max = numGroup.get(0);
		
		for(int i=0; i<numGroup.size(); i++) {
			if(numGroup.get(i)<min) {
				min=numGroup.get(i);
			}
			
			if(numGroup.get(i)>max) {
				max=numGroup.get(i);
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
