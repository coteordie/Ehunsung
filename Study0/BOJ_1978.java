package my;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_1978 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");		
		int cnt = 0;
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			int j = Integer.parseInt(st.nextToken());
			for(int k = 2; k <= j; k++) {
				if(j % k == 0) {
					cnt++;
				}
			}
			
			if(cnt == 1) {
				total++;
			}
			cnt = 0;			
		}
		
		bw.write(String.valueOf(total));
		bw.close();
	}

}
