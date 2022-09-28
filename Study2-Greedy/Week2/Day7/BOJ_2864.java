package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());

		String a = token.nextToken();
		String b = token.nextToken();
		
		String minA = "";
		String maxA = "";
		
		String minB = "";
		String maxB = "";
		
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == '6') {
				minA = minA + "5";
			}else {
				minA = minA + a.charAt(i);
				//6이 아닐 경우 그냥 대입
			}
			
			if(a.charAt(i) == '5') {
				maxA =  maxA + "6";
			}else {
				maxA = maxA + a.charAt(i);
				//5가 아닐 경우 그냥대입
			}
			//문자열로 입력 받은 A의 char의 순서대로 비교
			//각각 최소 최대 변수와 비교하여 항을 변경
			
		}
		
		
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == '6') {
				minB = minB + "5";
			}else {
				minB = minB + b.charAt(i);
				//6이 아닐 경우 그냥 대입
			}
			
			if(b.charAt(i) == '5') {
				maxB =  maxB + "6";
			}else {
				maxB = maxB + b.charAt(i);
				//5가 아닐 경우 그냥대입
			}
			//문자열로 입력 받은 B의 char의 순서대로 비교
			//각각 최소 최대 변수와 비교하여 항을 변경
			
		}
		
		int max = Integer.parseInt(maxA) +  Integer.parseInt(maxB);
		int min = Integer.parseInt(minA) +  Integer.parseInt(minB);
		//int 치한 후 각각 더해줌
		
		System.out.println(min + " " + max);
		
	}

}
