import java.util.Scanner;

public class T05 {
	 static int[] sorted = new int[1000001];
	public static void merge(int a[], int m , int middle, int n){
        int i=m;
        int j=middle + 1;
        int k=m;
        while(i<=middle && j<=n){
            if(a[i]<=a[j]){
                sorted[k]=a[i];
                i++;
            }else{
                sorted[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>middle){
            for(int t=j; t<=n; t++){
                sorted[k]=a[t];
                k++;
            }
        }else{
            for(int t=i; t<=middle; t++){
                sorted[k]=a[t];
                k++;
            }
        }
        for(int t=m; t<=n; t++){
            a[t]=sorted[t];
        }
    }
    
    public static void mergeSort(int a[], int m, int n){
        if(m<n){
            int middle= (m+n)/2;
            mergeSort(a, m, middle);
            mergeSort(a, middle+1, n);
            merge(a, m, middle, n);
        }
            
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] array=new int[num];
        
        for(int i=0; i<num; i++) {
        	array[i]=sc.nextInt();
        }
        
        mergeSort(array, 0, num-1);
        for(int i=0; i<num; i++){
            System.out.println(array[i]);
        }
	}
}
