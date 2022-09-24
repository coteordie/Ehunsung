package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14916 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(n == 1 || n == 3) {
			System.out.print(-1);
			return;
		}
		
		if(n % 5 == 0) {
			cnt += n / 5;
			System.out.print(cnt);
			return;
		}
		
		int temp = n;
		while(true) {
			temp -= 2;
			cnt++;
			if(temp % 5 == 0) {
				cnt += temp / 5;
				break;
			}
		}
		
		System.out.print(cnt);		
	}	

}
