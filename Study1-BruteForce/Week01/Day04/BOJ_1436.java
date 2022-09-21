package bruteForce;

import java.util.Scanner;

public class BOJ_1436 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = 0;
		int cnt = 0;
		String s = "";
		
		while(true) {
			num++;
			s = String.valueOf(num);
			
			if(s.contains("666")) 
				cnt++;
			
			
			if(cnt == n) 
				break;
		}		
		
		System.out.print(num);
		
	}

}
