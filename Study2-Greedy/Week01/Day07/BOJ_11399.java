package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] timeArr = new int[n];
		
		StringTokenizer token = new StringTokenizer(br.readLine()); 
		
		for(int i = 0; i < n; i++) {
			timeArr[i] = Integer.parseInt(token.nextToken());
		}
		
		Arrays.sort(timeArr);
		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				sum += timeArr[j];
			}
		}
		
		System.out.println(sum);
	}

}
