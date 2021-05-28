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
				//input[i]의 index 0번이 a라고 할때 1번은 a이거나 a가 아니어야함
				//만약 1번이 a가 아닐때 2번 이후로 a가 등장하면 그룹단어가 아님
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
