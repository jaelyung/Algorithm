import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt(); //����ڰ� �Է��ϴ� ��
		int[] bin=new int[100]; //�������� ��ȯ�� ���� ������ �迭
		
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
		
//		int i =0;//bin[]�� index��
//		int mok = inputNum;
//		
//		while (mok > 0) {
//			bin[i] = mok % 2;
//			mok /=2;
//			i++;
//		}
//		
//		i--;//������ �� 1���� �� �����
//		
//		for(; i>=0;i--) {
//			System.out.print(bin[i]);
//		}
	}
}
