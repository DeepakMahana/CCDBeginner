package stacknqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class STPAR {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// Process the inputs
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputlen = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().trim().split("\\s+");
		int[] inputarr = Arrays.asList(inputs).stream().mapToInt(Integer::parseInt).toArray();
		
		// Create a Stack for Side Street
		Stack<Integer> stack = new Stack<Integer>();
		boolean check = true;
		int a = 1; // a counter to check if the element is at the correct position
		for(int i=0; i<inputlen; i++){
			
			// Check if stack is empty and top elem equals a
			while(!stack.empty() && stack.peek() == a){
				a++;
				stack.pop();
			}
			// If the curr elem equals the correct destination then increment
			if(inputarr[i] == a){
				a++;
			// If the next elem from queue is gt the current in stack
			// It means the numbers cannot be sorted
			}else if(!stack.empty() && inputarr[i] > stack.peek()){ 
				check = false;
				break;
			}else{
				stack.push(inputarr[i]);
			}
		}
		
		if(check) System.out.println("yes");
		else System.out.println("no");
		
	}

}
