import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class T01 {
	
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		
//		int number=sc.nextInt();//�־����� ���� ����
//		int data[]=new int[6];//�迭 ũ�⸦ ����
		
//		for(int i=0; i<data.length;i++) {//������������ �����ؾ��ϴ� �迭
//			data[i]=sc.nextInt();
//		}
//		
//		int min, temp, index = 0;
//		int[] data={5,5,2,3,4,1};
//		for(int i=0; i<data.length;i++) {
//			min=9999;
//			for(int j=i; j<data.length;j++) {
//				if(min>data[j]) {
//					min=data[j];
//					index=j;
//				}
//			}
//			temp=data[i];
//			data[i]=data[index];
//			data[index]=temp;			
//		}
//		System.out.println(Arrays.toString(data));
		     
        ArrayList<Integer> list=new ArrayList<Integer>();
               
        int num=sc.nextInt();
        int min, temp, index = 0;
		for(int i=0; i<num;i++) {
			int inputNum=sc.nextInt();
            list.add(inputNum);
			
		}
        
        Collections.sort(list);
		System.out.println(list);
        
        sc.close();
		
	}
}
