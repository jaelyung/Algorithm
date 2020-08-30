import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt(); //사용자가 입력하는 수
		int[] bin=new int[100]; //이진수로 변환한 값을 저장할 배열
		
//		19/ 2	9 ... 1
//		9 / 2   4 ... 1
//		4 / 2	2 ... 0
//		2 / 2	1 ... 0
//		1 / 2	0 ... 1
		int count=0;
		for(int i=0;i<100;i++) {
			if(inputNum/2==0) {
				bin[count]=inputNum%2;
				break;
			}else {
				bin[count]=inputNum%2;
				inputNum=inputNum/2;
				count++;
			}	
		}
			
			
		for(int i=0;i<=count;i++) {
			System.out.print(bin[count-i]);
			
		}
		
//		int i =0;//bin[]의 index값
//		int mok = inputNum;
//		
//		while (mok > 0) {
//			bin[i] = mok % 2;
//			mok /=2;
//			i++;
//		}
//		
//		i--;//여분의 값 1개가 더 저장됨
//		
//		for(; i>=0;i--) {
//			System.out.print(bin[i]);
//		}
	}
}
