package my;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_1929 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int i;
		boolean arr[] = new boolean[n+1];
		
		arr[0] = arr[1] = true;  // 0과 1은 소수에서 제외.
		
		// 에라토스테네스의 체 사용
		int sqrt = (int) Math.sqrt(n);
		for(i = 2; i <= sqrt; i++) {
			for(int j = 2; j <= n/i; j++) {
				if(arr[i*j] == true) {
					continue;
				}
				else {
					arr[i*j] = true;
				}
			}
		}
		
		for(i = m; i <= n; i++) {
			if(arr[i] == false) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		
		bw.close();
	}

}
