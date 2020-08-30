import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class T10 {
	//HashSet을 사용해서 중복을 없앰

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		HashSet<String> set =new HashSet<String>();
	
		for(int i=0; i<number; i++) {
			set.add(br.readLine());
		}
		
		ArrayList<String> list = new ArrayList<String>(set);
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length())
					return 1;
				else if(o1.length() < o2.length())
					return -1;
				else
					return o1.compareTo(o2);
				
			}
			
		});
		
		for(String s : list) {
			System.out.println(s);
		}
	}

}
