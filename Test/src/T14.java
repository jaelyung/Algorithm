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
	
	//문제점 1. 동명이인 처리
	//map1.remove에서 key값이 같은 데이터를 모두 삭제함
	
	//List로 처리하는 문제점2. 효율성 실패 (정확도 100 효율성 0)
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
