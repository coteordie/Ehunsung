package solvedClass1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		
		int n = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			n = Integer.parseInt(arr[i]);
			sum += n * n;
		}
		
		System.out.println(sum % 10);		
		
	}
	

}
