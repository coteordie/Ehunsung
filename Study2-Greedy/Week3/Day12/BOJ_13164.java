package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_13164 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] height = new int[n];
		
		st = new StringTokenizer(br.readLine());
		height[0] = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < n; i++) {
			height[i] = Integer.parseInt(st.nextToken());
			height[i - 1] = height[i] - height[i - 1];
		}
		
		Arrays.sort(height);
		
		int sum = 0;
		
		for(int i = 0; i < n-k; i++) {
			sum += height[i];
		}
		
		System.out.println(sum);
		
		// 참고
		// https://burningjeong.tistory.com/436
	}

}
