import java.util.Arrays;
import java.util.Scanner;

//퀵정렬
//1<=n<=1000000 시간복잡도 때문에 퀵정렬 사용
//주어진 배열이 역순으로 정렬되어 있을 때 최악의 경우 O(N^)이 나올 수 있음
//mid 를 한번 잘라서 옮겨놓는 것으로 해결하기
public class T03 {
	//OutOfBoundsException
//	public static void quickSort(int[] data, int start, int end) {
//		
//		if(start>=end) {
//			return;
//		}
//		int mid=(start + end) / 2;
//		int temp=data[mid];
//		data[mid]=data[start];
//		data[start]=temp;
//		
//		
//		int key=start;
//		int i=start+1;
//		int j=end;
//		
//		while(i<=j) {
//			while(data[i]<=data[key] && i<=end) {
//				i++;
//			}
//			while(data[j]>=data[key] && j>start) {
//				j--;
//			}
//			if(i>j) {
//				temp=data[j];
//				data[j]=data[key];
//				data[key]=temp;
//				
//			}else {
//				temp=data[j];
//				data[j]=data[i];
//				data[i]=temp;
//			}
//			quickSort(data, start, j-1);
//			quickSort(data, j + 1, end);
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num=sc.nextInt();
//		int[] array=new int[num];
//		
//		for(int i=0; i<num; i++) {
//			array[i]=sc.nextInt();
//		}
//		
//		quickSort(array, 0, num-1);
//		System.out.println(Arrays.toString(array));
//		
//		
//	}

}
