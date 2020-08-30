import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputNum= new int[10];
		for(int i=0; i<10; i++) {
			inputNum[i] = sc.nextInt();
		}
		
		//사용자 input
		// 10개의 숫자를 입력받음
		
		int[] mode = new int[10];
		
		// index -> 출현한 수
		// index 값 -> index(출현한수)가 몇번나왔는지 저장
		
		//"mode[3] = 5, =>3번숫자가 5번 출현"
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
		
		int modeNum=0; //최빈수
		int modeCnt=0; //최빈수가 나온 횟수
		
		for(int i=0; i<10 ; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
				
			}
		}
		
		System.out.println("최빈수는: "+modeNum+ " cnt: "+modeCnt);
		
	}
}
