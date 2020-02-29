package problems;

import java.util.ArrayList;
import java.util.HashMap;

public class KakaoTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
		
		ArrayList<String> answer1 = new ArrayList<String>();
		ArrayList<String> answer2 = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<String, String>();			
		
		for(int i=0; i<record.length; i++) {
			if(record[i].split(" ")[0].equals("Enter")) {
				answer1.add("들어왔습니다.");
				answer2.add(record[i].split(" ")[1]);				
				if(!map.containsKey(record[i].split(" ")[1])) {
					map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
				}
			} else if(record[i].split(" ")[0].equals("Leave")){
				answer1.add("나갔습니다.");
				answer2.add(record[i].split(" ")[1]);
				map.remove(record[i].split(" ")[1]);

			} else {
				if(map.containsKey(record[i].split(" ")[1])) {
					map.put(record[i].split(" ")[1], record[i].split(" ")[2]);
				}
			}			 
		}
		
		for(int j=0; j<answer1.size(); j++) {
			System.out.println(map.get(answer2.get(j)) + "님이 " + answer1.get(j));
		}
	}

}
