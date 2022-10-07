package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최소, 최대
 */
public class BOJ_10818 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < n; i++) {
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
		}
		
		System.out.print(min + " " + max);
	}

}
