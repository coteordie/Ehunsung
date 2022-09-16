package bruteForce;

import java.util.Scanner;

public class BOJ_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] cards = new int[n];
		
		for(int i = 0; i < n; i++) {
			cards[i] = sc.nextInt();
		}
		
		int sum = 0;
		int answer = 0;
		
		for(int i = 0; i < cards.length-2; i++) {
			for(int j = i + 1; j < cards.length-1; j++) {
				for(int k = j + 1; k < cards.length; k++) {
					
					sum = cards[i] + cards[j] +  cards[k];
					
					if(sum == m) {
						System.out.println(sum);
						return;
					}
					else if(sum < m && sum > answer)
						answer = sum;
				}
			}
		}
		
		System.out.print(answer);
		
	}
}
