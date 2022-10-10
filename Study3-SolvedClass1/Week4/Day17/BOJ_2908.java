package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2908 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String a = st.nextToken();
		String b = st.nextToken();	
		
		for(int i = 2; i >= 0; i--) {
			if(a.charAt(i) > b.charAt(i)) {
				System.out.println(biggerNum(a));
				break;
			}
			else if(a.charAt(i) < b.charAt(i)) {
				System.out.println(biggerNum(b));
				break;
			}
			else {
				continue;
			}
		}
	}
	
	public static StringBuilder biggerNum(String num) {
		
		StringBuilder sb = new StringBuilder();	
		
		for(int i = 2; i >= 0; i--) {
			sb.append(num.charAt(i));
		}
		
		return sb;
		
	}

}
