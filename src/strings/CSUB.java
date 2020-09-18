package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSUB {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			int N = Integer.parseInt(br.readLine());
			String[] inputs = br.readLine().trim().split("");
			long countOnes = 0;
			for(int i=0; i<N; i++){
				if(inputs[i].equals("1")) countOnes++;
			}
			System.out.println( (countOnes * (countOnes + 1)) / 2);
		}
	}
}
