package bruteForce;

import java.util.Scanner;

public class BOJ_17614 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = 0;
		int clap = 0;
		int rest = 0;
		
		for(int i = 1; i <= n; i++) {
			temp = i;
			while(temp > 0) {
				rest = temp % 10;
				if(rest == 3 || rest == 6 || rest == 9) {
					clap++;
				}
				temp /= 10;
			}
		}
		
		System.out.print(clap);
	}

}
