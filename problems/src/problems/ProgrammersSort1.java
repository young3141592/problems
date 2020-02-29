package problems;

import java.util.Arrays;

public class ProgrammersSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[3];
		int[] temp = {};
		
		for(int i = 0; i < commands.length; i++) {
			temp = Arrays.stream(array, commands[i][0] - 1, commands[i][1]).sorted(). toArray();
			answer[i] = temp[commands[i][2] - 1];
		}
	}
}