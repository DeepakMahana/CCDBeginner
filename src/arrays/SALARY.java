package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SALARY {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		while(testcases > 0){
			int salaryCount = Integer.parseInt(br.readLine());
			int minimum = 0;
			String[] inputs = br.readLine().trim().split("\\s+");
			for(int i=0; i<salaryCount; i++){
				int currval = Integer.parseInt(inputs[i]);
				if(i==0){
					minimum = currval;
				}else if(minimum > currval){
					minimum = currval;
				}
			}
			int stepCount = 0;
			for(int i=0; i<salaryCount; i++){
				int curval = Integer.parseInt(inputs[i]);
				if(curval>minimum){
					stepCount = stepCount + curval - minimum;
				}
			}
			System.out.println(stepCount);
			testcases --;
		}
		
	}

}
