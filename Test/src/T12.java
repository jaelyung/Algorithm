import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class T12 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//기타 개수 입력 받기
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		String array[]=new String[number];
		
		//기타 시리얼 번호 입력(중복없음)
		for(int i=0; i<number; i++) {
			array[i]=br.readLine();
		}
		
		//1.시리얼번호 A와 B의 길이비교(짧은 순)
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) return 1;
				else if(o1.length() == o2.length()) {
					if(add(o1)==add(o2)) {
						return o1.compareTo(o2);
					}else {
						return Integer.compare(add(o1), add(o2));
					}
				}
				else return -1;
			}
			
		});
		
		for(int i=0; i<number; i++) {
			System.out.print(array[i]+"\n");
		}
		
	}
	
	public static int add(String o) {
		int sum=0;
		for(int i=0; i<o.length(); i++) {
			if(o.charAt(i)>='0' && o.charAt(i)<='9') {
				sum+=o.charAt(i)-'0'; //char에서 0은 null을 의미
			}
		}
		return sum;
	}
}
