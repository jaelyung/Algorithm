
import java.util.Scanner;
//틀림
public class T09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String[] heap = new String[20000];

		for (int i = 0; i < number; i++) {
			heap[i] = sc.nextLine();
		}

		// 힙을 구성
		for (int i = 1; i < number; i++) {
			int c = i;
			do {
				int root = (c - 1) / 2;
				if (heap[root].length() < heap[c].length()) {
					String temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				c = root;
			} while (c != 0);
		}

		// 크기를 줄여가며 반복적으로 힙을 구성
		for (int i = number - 1; i >= 0; i--) {
			String temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			int root = 0;
			int c = 1;
			do {
				c = 2 * root + 1;
				// 자식중에 더 큰 값 찾기
				if (c < i - 1 && heap[c].length() < heap[c + 1].length()) {
					c++;
				}
				// 루트보다 자식이 크다면 교환
				if (c < i && heap[root].length() < heap[c].length()) {
					temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				root = c;
			} while (c < i);
		}
		
		for(int i=0; i<number; i++) {
			System.out.print(heap[i]+"\n");
		}
	}
}
