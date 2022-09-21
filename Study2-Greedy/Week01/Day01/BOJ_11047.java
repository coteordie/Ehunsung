package greedy;

import java.util.Scanner;

public class BOJ_11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] coin = new int[n];
		int cnt = 0;
		int idx = 0;
		
		for(int i = n-1; 0 <= i; i--) {
			coin[i] = sc.nextInt();
		}
		
		for(int i = 0; i < coin.length; i++) {
			cnt += k/coin[idx];
			k %= coin[idx++];
		}
		
		System.out.print(cnt);
	}

}
