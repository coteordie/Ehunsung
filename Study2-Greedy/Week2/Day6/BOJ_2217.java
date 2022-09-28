package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2217 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] rope = new int[n];
		
		for(int i = 0; i < n; i++) {
			rope[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(rope);
		
		int max = 0;
		for(int i = rope.length-1; i >= 0; i--) {
			rope[i] = rope[i] * (n - i);
			if(max < rope[i]) {
				max = rope[i];
			}	
		}
		
		System.out.println(max);
		
	}
}
