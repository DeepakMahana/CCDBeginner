package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CHN15A {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		while(testcases > 0){
			
			String[] inputs = br.readLine().trim().split("\\s+");
			int arrcount = Integer.parseInt(inputs[0]);
			int power = Integer.parseInt(inputs[1]);
			
			String[] arrval = br.readLine().trim().split("\\s+");
			int wolvcount = 0;
			for(int i=0; i<arrcount; i++){
				int currval = Integer.parseInt(arrval[i]) + power;
				if(currval % 7 == 0) wolvcount++;
			}
			System.out.println(wolvcount);
			testcases --;
		}
	}

}
