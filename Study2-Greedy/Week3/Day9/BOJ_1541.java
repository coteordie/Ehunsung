package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer minus = new StringTokenizer(br.readLine(), "-");
		
		int sum = Integer.MAX_VALUE;
		
		while(minus.hasMoreTokens()) {
			
			int temp = 0;
			StringTokenizer plus = new StringTokenizer(minus.nextToken(), "+");
			
			while(plus.hasMoreTokens()) {
				temp += Integer.parseInt(plus.nextToken());
			}

			if(sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		
		
		System.out.println(sum);
		
	}

}
