package MinAndMax;

import java.util.ArrayList;
import java.util.Scanner;

public class Num10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//������ ���� �Է�
		int leng = sc.nextInt(); 
		
		ArrayList<Integer> numGroup = new ArrayList<Integer>();
		
		//�Էµ� ������ŭ �ݺ��ϸ� ���� �Է�
		for(int i=0; i<leng; i++) {
			int inputNum = sc.nextInt();
			numGroup.add(inputNum);
		}
		
		//min, max, temp ����
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
