package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ProgrammersJobfair3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] healths = {200, 120, 150};
		int[][] items = {{30, 100}, {500, 30}, {100, 400}};
		items_list[] items_chk = new items_list[items.length];
		
		ArrayList<Integer> list = new ArrayList<>();		
		
		for(int i=0; i<items.length; i++) {
			items_chk[i] = new items_list();
			items_chk[i].idx = i + 1;
			items_chk[i].item_attrbt[0] = items[i][0];
			items_chk[i].item_attrbt[1] = items[i][1];
		}
		
		Arrays.sort(items_chk,new Comparator<items_list>(){
			public int compare(items_list il1, items_list il2) {
				if(il2.item_attrbt[0] == il1.item_attrbt[0]) {
					return il1.item_attrbt[1] - il2.item_attrbt[1];
				} else {
					return il2.item_attrbt[0] - il1.item_attrbt[0];
				}
			}
		});
		Arrays.sort(healths);
		
		for(int i=0; i<items_chk.length; i++) {
			for(int j=0; j<healths.length; j++) {
				if(items_chk[i].item_attrbt[1] + 100 <= healths[j]) {
					healths[j] = -1;
					list.add(items_chk[i].idx);
					break;
				}
			}
		}
		
		int[] answer = new int[list.size()];
		Collections.reverse(list);
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i); 
		}
		
		
	}
}

class items_list{
	Integer idx = 0;
	Integer[] item_attrbt = new Integer[2];	
}
