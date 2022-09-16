package bruteForce;

import java.io.IOException;
import java.util.Scanner;

class BOJ_2231 {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		// 위 입력된 n을 만들 수 있는 가장 작은 생성자 구하기
		for(int i = 1; i <= n; i++) {
			String temp = Integer.toString(i); 
			int sum = 0;
			
			for(int j = 0; j < temp.length(); j++) {
				sum += Character.getNumericValue(temp.charAt(j));
			}
			sum += i;
			
			if(sum == n) {
				System.out.println(temp);
				break;
			}
			else if(i == n) {
				// i가 n번까지 돌았는데 생성자 안나왔으면 -> 그럼 생성자 없는거니까 0 출력해
				System.out.println(0);
			}
		}
		
	}

}
 