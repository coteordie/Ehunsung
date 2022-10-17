package solvedClass1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_9498 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int score = Integer.parseInt(br.readLine());
		
		bw.write((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C": (score >= 60) ? "D": "F");
		
		bw.flush();
		bw.close();
	}

}
