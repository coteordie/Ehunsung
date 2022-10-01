package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1092 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> crane = new ArrayList<Integer>();		
		for(int i = 0; i < n; i++) {
			crane.add(Integer.parseInt(st.nextToken()));
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		List<Integer> box = new ArrayList<Integer>();		
		for(int i = 0; i < m; i++) {
			box.add(Integer.parseInt(st.nextToken()));
		}
		
		crane.sort(Collections.reverseOrder());
		box.sort(Collections.reverseOrder());
		
		if(box.get(0) > crane.get(0)) {
			System.out.println(-1);
		}
		else {
			// https://dy-coding.tistory.com/m/entry/%EB%B0%B1%EC%A4%80-1092%EB%B2%88-%EB%B0%B0-java
			int time = 0;
			while(!box.isEmpty()) { // 박스 다 옮길때까지
				int boxIdx = 0;
				int craneIdx = 0;
				
				while(craneIdx < n) {  // 크레인 다 쓸때까지
					if(boxIdx == box.size())
						break; // 박스 인덱스가 박스 사이즈랑 같으면 
					else if(crane.get(craneIdx) >= box.get(boxIdx)) {
						// 크레인용량이 박스용량보다 크면 박스 옮기기 쌉가
						box.remove(boxIdx); // 옮긴 박스 리스트에서 제거해
						craneIdx++; // 크레인 썼으니까 다음크레인으로 고고
					}
					else {
						boxIdx++;  
						// 크레인보다 박스가 더 커서 옮길 수 없는 경우 -> 다음 박스 옮기기
					}
				}
				
				time++;
			}
			
			System.out.println(time);
		}
	}

}
