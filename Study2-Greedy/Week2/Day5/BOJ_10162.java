package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10162 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] button = {5*60, 1*60, 10};
		int[] cntArr = new int[3];
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < button.length; i++) {
			cntArr[i] = t / button[i];
			t %= button[i];
		}
		
		if(t != 0) {
			System.out.print(-1);
			return;
		}
		
		for(int i = 0; i < cntArr.length; i++) {
			System.out.print(cntArr[i]);
			if(i != cntArr.length -1) {
				System.out.print(" ");
			}
		}
	}

}
