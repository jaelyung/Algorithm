package strings;

import java.util.Scanner;

public class Num10809 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. ���ڿ� 1�� �Է¹���
		String input = sc.nextLine();
		
		//2. ���ĺ� a~z������ �迭
		int[] temp = new int[26];
		
		//3. �迭 temp�� ��� ���� -1�� �ʱ�ȭ
		for(int i=0; i<26; i++) {
			temp[i] = -1;
		}
		
		//4. �ƽ�Ű�ڵ� a~z�� �ǹ��ϴ� 97~122
		for(int j=97; j<=122; j++) {
			//5. ���ڿ� index (0) ���� ������
			for(int i=0; i<input.length(); i++) {
				if(temp[i] == -1 && j == input.charAt(i)) {
					System.out.println("input.charAt(i)>>>>>>"+ input.charAt(i));
					//temp[j]�� -1�̰� j�� 97�϶� a�� input.charA(0)�� ���ٸ� 
					//temp[j]�� input�� index���� �ִ´�.
					temp[i]=i;					
				}
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
	}	
	
}
