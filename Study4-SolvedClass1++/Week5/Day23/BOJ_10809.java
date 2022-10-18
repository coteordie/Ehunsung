package solvedClass1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
	
		for(char i = 'a'; i <= 'z'; i++) {
			bw.write(word.indexOf(i) + " ");
		}
		
		bw.close();
	}

}
