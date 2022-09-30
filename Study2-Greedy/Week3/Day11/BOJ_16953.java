package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_16953 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int start = Integer.parseInt(input[0]);
		int end = Integer.parseInt(input[1]);
		
		
		int cnt = 1;
		while(start != end) {
			
			if(end < start) {
				System.out.println(-1);
				return;
			}
			
			if(end % 10 == 1) end /= 10;
			else if (end % 2 == 0) end /= 2;
			else {
				System.out.println(-1);
				return;
			}
			
			cnt ++;
		}
		
		System.out.println(cnt);
		
	}

}
