package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2577 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 1;
		
		for(int i = 0; i < 3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		
		String str = String.valueOf(result);
		int[] arr = new int[10];

		for(int i = 0; i < str.length(); i++) {
			arr[Character.getNumericValue(str.charAt(i))]++;
		}	
		
		for(int n : arr) {
			System.out.println(n);
		}
	}

}
