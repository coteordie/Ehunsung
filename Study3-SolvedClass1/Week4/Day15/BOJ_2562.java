package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2562 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		int index = 0;
		for(int i = 1; i < 9; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
		
	}

}
