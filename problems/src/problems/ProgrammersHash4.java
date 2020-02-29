package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class ProgrammersHash4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int cnt = 0;
		HashMap<String, data_set> map = new HashMap<>();
		ArrayList<data_set> list = new ArrayList<>();
		
		for(int i=0; i<genres.length; i++) {
			if(map.containsKey(genres[i])) {				
				map.get(genres[i]).sum = map.get(genres[i]).sum + plays[i];
				if(map.get(genres[i]).top_2[0][1] < plays[i]) {
					map.get(genres[i]).top_2[1][0] = map.get(genres[i]).top_2[0][0];
					map.get(genres[i]).top_2[1][1] = map.get(genres[i]).top_2[0][1];
					map.get(genres[i]).top_2[0][0] = i;
					map.get(genres[i]).top_2[0][1] = plays[i];
				} else if(map.get(genres[i]).top_2[1][1] < plays[i]) {
					map.get(genres[i]).top_2[1][0] = i;
					map.get(genres[i]).top_2[1][1] = plays[i];
				}
			} else {
				data_set temp = new data_set();
				temp.sum = plays[i];
				temp.top_2[0][0] = i;
				temp.top_2[0][1] = plays[i];
				map.put(genres[i], temp);
			}
		}
		
		for(String genre : map.keySet()) {
			list.add(map.get(genre));
			if(map.get(genre).top_2[1][1] != -1) {
				cnt = cnt + 2;
			} else {
				cnt++;
			}
		}
		
		Collections.sort(list, new Comparator<data_set>() {
			public int compare(data_set ds1, data_set ds2) {
				return ds2.sum - ds1.sum;
			}
		});
		int[] answer = new int[cnt];
		int i = 0;
		for(data_set datas : list) {
			if(datas.top_2[0][1] != -1) {
				answer[i] = datas.top_2[0][0];
				i++;
			}
			if(datas.top_2[1][1] != -1) {
				answer[i] = datas.top_2[1][0];
				i++;
			}			
		}
		
		for(int j=0; j<answer.length; j++) {
			System.out.println(answer[j]);			
		}
	}

}

class data_set {
	Integer sum = -1;
	Integer[][] top_2 = {{-1, -1}, {-1, -1}}; 
}