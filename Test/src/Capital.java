import java.util.Scanner;

public class Capital {
	//대문자는 소문자, 소문자는 대문자로 변환
	//helloWorlD
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputStr=sc.nextLine();
//		String[] str= {};
//		
//		int j=0;//inputStr를 다 쪼갰을 때 index
//		for(int i=0; i<inputStr.length(); i++) {
//			str[i]=inputStr.split("");
//		}
		
		String input = "helloWorlD";
		char[] arr;
		arr = input.toCharArray(); //문자열을 char형 배열로 바꿔줌
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]>= 'A' && arr[i] <= 'Z') { //대문자일때
				arr[i] = (char) (arr[i] - ('A'-'a')); //대문자와 소문자와의 간격을 뺀다
			}else if(arr[i]>='a' && arr[i] <= 'z'){//소문자일때
				arr[i] = (char) (arr[i] + ('A'-'a')); //대문자와 소문자와의 간격을 더한다.
			}
		}
		
		System.out.println(arr);
	}
}
