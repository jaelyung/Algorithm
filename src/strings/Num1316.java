package strings;

import java.util.Scanner;

public class Num1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		String[] input = new String[num];
		int group = 0;
		boolean flag = true;
		for(int i=0; i<num; i++) {
			input[i] = sc.nextLine();
			for(int j=0; j<input[i].length(); j++) {
				//input[i]�� index 0���� a��� �Ҷ� 1���� a�̰ų� a�� �ƴϾ����
				//���� 1���� a�� �ƴҶ� 2�� ���ķ� a�� �����ϸ� �׷�ܾ �ƴ�
				char crtr = input[i].charAt(j);
				if(j+1 < input[i].length()) {
					if(crtr != input[i].charAt(j+1)) {
						for(int k=j+1; k<input[i].length(); k++) {
							if(crtr == input[i].charAt(k)) {
								if(crtr != input[i].charAt(input[i].length()-1)) {
									flag = false;
								}
								
							}
						}
						
					}
				}				
			}
			if(flag == true) {
				group++;
			}
		}
		System.out.println(group);

	}

}
