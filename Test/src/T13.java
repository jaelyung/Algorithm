import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		int array[]=new int[number];
		int count[]=new int[number];
		
		for(int i=0; i<number; i++) {
			array[i]=Integer.parseInt(br.readLine());
			count[i]=0;
		}
		
		for(int i=0; i<number; i++ ) {
			count[array[i]-1]++;
		}
		for(int i=0; i<number; i++) {
			if(count[i] != 0) {
				for(int j=0; j<count[i]; j++) {
					System.out.print((i+1)+"\n");
				}
			}
		}
		
	}

}
