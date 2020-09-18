package stacknqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ONP {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Process the inputs
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			String[] input = br.readLine().trim().split("");
			Stack<String> stack = new Stack<String>();
			StringBuilder soln = new StringBuilder(); 
			
			for(int i=0; i<input.length; i++){
				
				if(input[i].equals("(") || input[i].equals(")") || input[i].equals("-") || input[i].equals("+") 
						|| input[i].equals("*") || input[i].equals("/") || input[i].equals("^")){
					if(input[i].equals(")")){
							soln.append(stack.peek());
							stack.pop();
							stack.pop();
					}else{
						stack.push(input[i]);
					}
				}else{
					soln.append(input[i]);
				}
			}
			System.out.println(soln);
		}
	}
}
