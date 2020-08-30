import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class T08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		
		int heap[]=new int[number];
		
		for(int i=0; i<number; i++) {
			heap[i]=Integer.parseInt(br.readLine());
		}
		
		//���� ����
		for(int i=1; i<number; i++) {
			int c = i;
			do {
				int root=(c-1)/2;
				if(heap[root]<heap[c]) {
					int temp=heap[root];
					heap[root]=heap[c];
					heap[c]=temp;
				}
				c=root;
			}while(c != 0);
		}
		
		//ũ�⸦ �ٿ����� �ݺ������� ���� ����
		for(int i=number-1; i>=0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			int root = 0;
			int c = 1;
			do {
				c =2*root+1;
				//�ڽ��߿� �� ū �� ã��
				if(c<i-1 && heap[c] <heap[c+1]) {
					c++;
				}
				//��Ʈ���� �ڽ��� ũ�ٸ� ��ȯ
				if(c<i && heap[root]<heap[c]) {
					temp=heap[root];
					heap[root]=heap[c];
					heap[c]=temp;
				}
				root = c;
			}while(c<i);
		}
		
		for(int i=0; i<number; i++) {
			System.out.print(heap[i]+" ");
		}
	}
	
}
