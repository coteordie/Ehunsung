package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1546 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		double[] arr = new double[n];
		
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(st.nextToken());	
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			arr[i] = arr[i] / max * 100.0;
			sum += arr[i];
		}
		
		System.out.println(sum / n);
	}

}
