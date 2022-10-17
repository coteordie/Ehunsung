package solvedClass1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ_10171 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\");
		bw.newLine();	// 줄 
		
		bw.write(" )  ( ')");
		bw.newLine();	
        
		bw.write("(  /  )");
		bw.newLine();
        
		bw.write(" \\(__)|");
		
		bw.flush();
		bw.close();
	}

}
