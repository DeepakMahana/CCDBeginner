package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class COPS {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases > 0){
			
			// Process Multiple Testcases Input
			int[] houses = new int[105];
			Arrays.fill(houses, 0);
			String[] inputs = br.readLine().trim().split("\\s+");
			String[] inputarrstr = br.readLine().trim().split("\\s+");
			int[] inputarr = Arrays.asList(inputarrstr).stream().mapToInt(Integer::parseInt).toArray();
			
			// Main Logic
			int speedtime = Integer.parseInt(inputs[1]) * Integer.parseInt(inputs[2]);
			for(int i=0; i<Integer.parseInt(inputs[0]); i++){
				int elem = inputarr[i];
				// Calculate Range and mark 1 for start and -1 for end
				int leftrange = Math.max(1, elem - speedtime);
				int rightrange = Math.min(101, elem + speedtime + 1);
				houses[leftrange] += 1;
				houses[rightrange] += -1;
			}
			
			// This loop will mark all the houses where policemen can reach
			for(int j=2; j<=100; j++)
			{
				houses[j] = houses[j] + houses[j-1];
			}
			
			// Final array will have 0's where the theif is safe
			int count = 0;
			for(int i=1; i<=100; i++)
			{
				if(houses[i] == 0)
					count++;
			}
			
			System.out.println(count);
			testcases--;
		}
	}

}
