public class Fibo {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		//An = An-1 + An-2;
		//n>=3
		//a1=1, a2=1;
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		for(int i=1; i<=10; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		//배열을 쓰지 않고 구현
		int n=1; //An-2
		int n1=1;//An-1
		System.out.println();
		System.out.print(n+" ");
		System.out.print(n1+" ");
		
		for(int i=3; i<=10; i++) {
			int curNum=n1+n;
			System.out.print(n1+n+" ");
			n=n1;
			n1=curNum;
			
		}
	}
}
