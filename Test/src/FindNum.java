import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputNum= new int[10];
		for(int i=0; i<10; i++) {
			inputNum[i] = sc.nextInt();
		}
		
		//����� input
		// 10���� ���ڸ� �Է¹���
		
		int[] mode = new int[10];
		
		// index -> ������ ��
		// index �� -> index(�����Ѽ�)�� ������Դ��� ����
		
		//"mode[3] = 5, =>3�����ڰ� 5�� ����"
//		int index=0;
//		for(index=0; index<10; index++) {
//			mode[index]=0;
//			System.out.println("mode["+index+"]= " + mode[index]);
//			for(int i=0;i<10;i++) {
//				if(inputNum[i]==i) {
//					mode[index]++;
//					
//				}
//			}
//		}
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;
			System.out.println("mode ["+inputNum[i]+"] = "+mode[inputNum[i]]);
		}
		
		int modeNum=0; //�ֺ��
		int modeCnt=0; //�ֺ���� ���� Ƚ��
		
		for(int i=0; i<10 ; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
				
			}
		}
		
		System.out.println("�ֺ����: "+modeNum+ " cnt: "+modeCnt);
		
	}
}
