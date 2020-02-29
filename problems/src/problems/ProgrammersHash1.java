package problems;

import java.util.HashMap;
import java.util.Iterator;

public class ProgrammersHash1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		int temp = 0;
		String answer = "";
		HashMap<String, Integer> ptcp = new HashMap<String, Integer>();
		
		for(int i=0; i<participant.length; i++) {
			if(ptcp.containsKey(participant[i])) {
				temp = ptcp.get(participant[i]).intValue();
				ptcp.put(participant[i], ++temp);
				temp = 0;
			} else {
				ptcp.put(participant[i], 1);
			}
		}
		for(int j=0; j<completion.length; j++) {
			if(ptcp.containsKey(completion[j])) {
				//System.out.println(completion[j]);
				if(ptcp.get(completion[j]) > 1) {
					temp = ptcp.get(completion[j]);
					ptcp.put(completion[j], --temp);
				} else {
					ptcp.remove(completion[j]);
				}					
			}
		}
		
		Iterator<String> mapIter = ptcp.keySet().iterator();
		while(mapIter.hasNext()) {
			answer = mapIter.next();
		}
		
		System.out.println(answer);
	}

}
