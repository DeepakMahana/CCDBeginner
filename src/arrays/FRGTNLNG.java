package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FRGTNLNG {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases > 0){
			
			String[] inputcount = br.readLine().trim().split("\\s+");
			String[] inputs = br.readLine().trim().split("\\s+");
			
			String out = "";
			List<String> tests = new ArrayList<String>();
			
			// Get all searching strings in one list
			for(int i=0; i < Integer.parseInt(inputcount[1]); i++){
				String[] testinput = br.readLine().trim().split("\\s+");
				for(int j=1; j <= Integer.parseInt(testinput[0]); j++){
					tests.add(testinput[j]);
				}
			}
			
			for(int i=0; i < Integer.parseInt(inputcount[0]); i++){
				boolean found = false;
				for(int j=0; j<tests.size(); j++){
					if(inputs[i].equals(tests.get(j))){
						found = true;
						break;
					}
				}
				String res = found ? "YES " : "NO ";
				out += res;
			}
			
			System.out.println(out);
			testcases --;
			
		}
	}

}
