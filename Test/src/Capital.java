import java.util.Scanner;

public class Capital {
	//�빮�ڴ� �ҹ���, �ҹ��ڴ� �빮�ڷ� ��ȯ
	//helloWorlD
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String inputStr=sc.nextLine();
//		String[] str= {};
//		
//		int j=0;//inputStr�� �� �ɰ��� �� index
//		for(int i=0; i<inputStr.length(); i++) {
//			str[i]=inputStr.split("");
//		}
		
		String input = "helloWorlD";
		char[] arr;
		arr = input.toCharArray(); //���ڿ��� char�� �迭�� �ٲ���
		
		for(int i=0; i<arr.length ; i++) {
			if(arr[i]>= 'A' && arr[i] <= 'Z') { //�빮���϶�
				arr[i] = (char) (arr[i] - ('A'-'a')); //�빮�ڿ� �ҹ��ڿ��� ������ ����
			}else if(arr[i]>='a' && arr[i] <= 'z'){//�ҹ����϶�
				arr[i] = (char) (arr[i] + ('A'-'a')); //�빮�ڿ� �ҹ��ڿ��� ������ ���Ѵ�.
			}
		}
		
		System.out.println(arr);
	}
}
