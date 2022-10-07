package solvedClass1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 알람시계
 */
public class BOJ_2884 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int time = 0;
		
		time = h * 60 + m - 45;		
		
		if(time < 0) {
			h = 23;
			m = 60 + time;
		}
		else {
			h = time / 60;
			m = time % 60;
		}
	
		System.out.print(h + " " + m);
		
	}

}
