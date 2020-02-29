package problems;

import java.util.ArrayList;
import java.util.List;

public class KaKaoTest1_20190907 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		int answer = Integer.MAX_VALUE;
		
		
		for(int len=1; len<=s.length()/2; len++) {
			List<String> temp = new ArrayList<>();
			int tempResult = 0; 
			
			for(int i=0; i*len<s.length(); i++) {
				if(((i+1)*len > s.length())) {
					System.out.println(">" + s.substring(i*len, s.length()));
					temp.add(s.substring(i*len, s.length()));
				} else {
					System.out.println(s.substring(i*len, (i+1)*len));
					temp.add(s.substring(i*len, (i+1)*len));
				}
			}
			
			String temp2 = temp.get(0);
			for(int j=0; j<temp.size()-1; j++) {
				if(j == temp.size()-2) {
					if(temp.get(j+1).equals(temp2)) {
						tempResult += len+1;
					} else {
						tempResult += temp.get(j).length() + temp.get(j+1).length();
					}
				} else if(!temp.get(j+1).equals(temp2)) {
					if(j!=0 && temp.get(j-1).equals(temp2)) {
						tempResult += len+1;
						System.out.println(len + ">" + j + ">" + temp.get(j) + ">" + tempResult);
					} else {
						tempResult += len;
						System.out.println(len + ">" + j+ ">>" + temp.get(j) + ">>" + tempResult);
					}
					temp2 = temp.get(j+1);					
				} 
			}
			
			System.out.println(len + ">" + temp.size() + ">" + tempResult);
			if(answer > tempResult) {
				answer = tempResult;
			}
		}
		
		System.out.println(answer);
	}
}
