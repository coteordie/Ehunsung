package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2920 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[st.countTokens()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		String answer = "ascending";
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1] + 1) {
				answer = "ascending"; 
			}
			else if(arr[i] == arr[i-1] - 1) {
				answer = "descending";
			}
			else {
				answer = "mixed";
				break;
			}
		}
		
		System.out.println(answer);
	}

}
