package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RAINBOWA {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases > 0){
			
			int arrcount = Integer.parseInt(br.readLine());
			String[] inputs = br.readLine().trim().split("\\s+");
			int[] inputarr = Arrays.asList(inputs).stream().mapToInt(Integer::parseInt).toArray();
			
			int c = 0;
			String out = "yes";
			
			for(int i = 0; i<arrcount; i++){
				if(inputarr[i] > 7) c = 1;
			}
			
			if(c==1 || inputarr[arrcount/2] != 7 || inputarr[0] != 1){
				out = "no";
			}else{
				
				int k = arrcount - 1, r = 1;
				for(int i=0; i<arrcount/2; i++){
					
					if(inputarr[i]==r && inputarr[i]==inputarr[k--]){
						if(inputarr[i+1] == r+1 || inputarr[i+1] == r){
							r = inputarr[i+1];
						}else{
							out = "no";
						}
					}else{
						out="no";
					}
				}
			}
			
			System.out.println(out);
			testcases --;
		}
	}
}
