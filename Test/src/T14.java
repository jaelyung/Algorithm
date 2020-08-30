import java.util.*;
public class T14 {
	public String solution(String[] participant, String[] completion) {
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		for (int i = 0; i < participant.length; i++) {
			map1.put(participant[i], 0);
		}

		for (int i = 0; i < completion.length; i++) {
			map1.remove(completion[i]);
		}

		String answer = "";
		for (String str : map1.keySet()) {
			answer=str;
		}
		return answer;
	}

//	import java.util.HashMap;
//
//	class Solution {
//	    public String solution(String[] participant, String[] completion) {
//	        String answer = "";
//	        HashMap<String, Integer> hm = new HashMap<>();
//	        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
//	        for (String player : completion) hm.put(player, hm.get(player) - 1);
//
//	        for (String key : hm.keySet()) {
//	            if (hm.get(key) != 0){
//	                answer = key;
//	            }
//	        }
//	        return answer;
//	    }
//	}
	
	//������ 1. �������� ó��
	//map1.remove���� key���� ���� �����͸� ��� ������
	
	//List�� ó���ϴ� ������2. ȿ���� ���� (��Ȯ�� 100 ȿ���� 0)
	public static void main(String[] args) {
		String answer = "";
		String[] participant = { "leo", "kiki", "leo" };
		String[] completion = { "leo", "kiki" };
		
		HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        
        
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        System.out.println(answer);
		

	}
	
}
