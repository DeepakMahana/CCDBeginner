package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CNOTE {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		for(int test = 1; test<=testcases; test++){
			String[] inputs = br.readLine().trim().split("\\s+");
			int X = Integer.parseInt(inputs[0]);
			int Y = Integer.parseInt(inputs[1]);
			int K = Integer.parseInt(inputs[2]);
			int N = Integer.parseInt(inputs[3]);
			boolean endresult = false;
			for(int i=0; i<N; i++){
				inputs = br.readLine().trim().split("\\s+");
				int pages = Integer.parseInt(inputs[0]);
				int price = Integer.parseInt(inputs[1]);
				if(price <= K && pages>=(X-Y)){
					endresult = true;
				}
			}
			String out = endresult ? "LuckyChef" : "UnluckyChef";
			System.out.println(out);
		}
		
	}

}
