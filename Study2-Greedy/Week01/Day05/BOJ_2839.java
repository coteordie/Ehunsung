package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(n % 5 == 0) {
			cnt += n / 5;
			System.out.print(cnt);
			return;
		}
		
		int temp = n;
		while(true) {
			temp -= 3;
			
			if(temp < 0) break;
			
			cnt++;
			if(temp % 5 == 0) {
				cnt += temp / 5;
				System.out.print(cnt);
				return;
			}	
		}
		
		System.out.print(-1);		
	}

}
