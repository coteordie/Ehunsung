package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_8958 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] result = new String[n];
		
		for(int i = 0; i < n; i++) {
			result[i] = br.readLine();
		}
		
		for(int i = 0; i < n; i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j = 0; j < result[i].length(); j++) {
				if(result[i].charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);	
		}
		
	}

}
