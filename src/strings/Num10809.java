package strings;

import java.util.Scanner;

public class Num10809 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 문자열 1개 입력받음
		String input = sc.nextLine();
		
		//2. 알파벳 a~z까지의 배열
		int[] temp = new int[26];
		
		//3. 배열 temp의 모든 값에 -1로 초기화
		for(int i=0; i<26; i++) {
			temp[i] = -1;
		}
		
		for(int i=0; i<input.length(); i++) {
			char letter = input.charAt(i);

			if(temp[letter - 'a'] == -1) {
				temp[letter - 'a'] = i;
			}
		}
		
		
		
		
		//4. 아스키코드 a~z를 의미하는 97~122
//		for(int j=97; j<=122; j++) {
//			//5. 문자열 index (0) 부터 끝까지
//			for(int i=0; i<input.length; i++) {
//				if(temp[i] == -1 && input[i].charAt(i) == j) {
//					System.out.println("input.charAt(i)>>>>>>"+ input[i].charAt(i));
//					//temp[j]가 -1이고 j가 97일때 a가 input.charA(0)과 같다면 
//					//temp[j]에 input의 index값을 넣는다.
//					temp[i]=i;					
//				}
//			}
//		}
			
		for(int i=0; i<26; i++) {
			System.out.print(temp[i] + " ");
		}
		
		
	}	
	
}
