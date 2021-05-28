package strings;

import java.util.Scanner;

public class Num1316 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		int num = Integer.parseInt(sc.nextLine());
//		String[] input = new String[num];
//		int group = 0;
//		boolean flag = true;
//		for(int i=0; i<num; i++) {
//			input[i] = sc.nextLine();
//			for(int j=0; j<input[i].length(); j++) {
//				//input[i]의 index 0번이 a라고 할때 1번은 a이거나 a가 아니어야함
//				//만약 1번이 a가 아닐때 2번 이후로 a가 등장하면 그룹단어가 아님
//				char crtr = input[i].charAt(j);
//				if(j+1 < input[i].length()) {
//					if(crtr != input[i].charAt(j+1)) {
//						for(int k=j+1; k<input[i].length(); k++) {
//							if(crtr == input[i].charAt(k)) {
//								if(crtr != input[i].charAt(input[i].length()-1)) {
//									flag = false;
//								}
//								
//							}
//						}
//						
//					}
//				}				
//			}
//			if(flag == true) {
//				group++;
//			}
//		}
//		System.out.println(group);
		
		int count =0;
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);

	}
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				
				if( check[now - 'a'] == false) {
					check[now -'a'] = true;
					prev = now;
				}else {
					return false;
				}
			}else {
				continue;
			}
		}
		
		return true;
	}

}
