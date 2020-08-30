import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class T11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int number=Integer.parseInt(br.readLine());
		String[] word= new String[number];
		
		for(int i=0; i<number; i++) {
			word[i]=br.readLine();
		}
		
		Arrays.sort(word, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) return 1;
				else if(o1.length() == o2.length()) return 0;
				else return -1;
			}
			
		});
		
		for(int i=0; i<number; i++) {
			int j;
			for(j=i+1; j<number; j++) {
				if(word[i].length() != word[j].length()) break;
			}
			Arrays.sort(word, i, j);
			i = j-1;
		}
		
		System.out.println(word[0]);
		for(int i=1; i<number; i++) {
			if(word[i-1].equals(word[i])) continue;
			
			System.out.println(word[i]);
		}
	}

}
