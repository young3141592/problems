package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class kakaoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		double tempAll = 0;
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();	
		
		double[] failR = new double[N];
		int[] nums = new int[200000];
		for(int i=0; i<stages.length; i++) {
			nums[stages[i]]++;
		}
		for(int j=0; j<N; j++) {
			if(j==0) {
				tempAll = stages.length;
			}
			map.put(j, nums[j+1]/tempAll);	
			failR[j] = nums[j+1]/tempAll;
			tempAll = tempAll - nums[j+1];
		}	
				
		Iterator it = sortByValue(map).iterator();
		
        int i=0;
        int[] answer = new int[N];
        while(it.hasNext()) {        	
        	answer[i] = Integer.parseInt(it.next().toString())+1;
        	i++; 
        }
    
        for(int j=0; j<N; j++) {
        	System.out.println(answer[j]);
        }

	}

	public static List sortByValue(final Map map) {
        List<String> list = new ArrayList();
        list.addAll(map.keySet());
         
        Collections.sort(list,new Comparator() {
             
            public int compare(Object o1,Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                 
                return ((Comparable) v2).compareTo(v1);
            }
             
        });
//        Collections.reverse(list); // 주석시 오름차순
        return list;

    }
	
}
