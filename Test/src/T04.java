import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class T04 {
	
	public static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left >= right) return;

		int pivot = arr[right];//key°ª
		int l = left;
		int r = right-1;
		
		while( l<=r ) {
			while(l<=r && arr[l]<=pivot) l++;
			while(l<=r && arr[r]>=pivot) r--;
		}
		swap(arr, l, right);
		quickSort(arr, left, l-1);
		quickSort(arr, l+1, right);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		int n = Integer.parseInt(br.readLine().trim());
		int arr[]= new int[n];
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int arr[]= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine().trim());
		}
		
		quickSort(arr,0,n-1);
		
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
