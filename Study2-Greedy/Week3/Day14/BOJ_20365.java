package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_20365 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); 
		String colors = br.readLine();
		List<String> bList = new ArrayList<>();
		List<String> rList = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(colors, "R");
		while(st.hasMoreTokens()) {
			bList.add(st.nextToken());
		}
		
		st = new StringTokenizer(colors, "B");
		while(st.hasMoreTokens()) {
			rList.add(st.nextToken());
		}
		
		int answer = 0;
		
		if(rList.size() >= bList.size()) {
			answer = bList.size() + 1;
		}
		else {
			answer = rList.size() + 1;
		}
		
		System.out.println(answer);
	}
	

}
