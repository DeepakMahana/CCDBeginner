package stacknqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MMASS {
	
	public static int getMolecularMass(String molecule){
		if(molecule.equals("H")) return 1;
		if(molecule.equals("C")) return 12;
		if(molecule.equals("O")) return 16;
		return 0;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			String[] formula = br.readLine().trim().split("");
			Stack<Integer> stack = new Stack<Integer>();
			
			for(int i=0; i<formula.length; i++){
				
				// If Opening bracket push -1 to know the start of bracket
				if(formula[i].equals("(")){
					stack.push(-1);
				}else if(formula[i].equals(")")){
					// Pop elements until opening bracket value -1 is found
					int tempmass = 0;
					while(stack.peek() != -1){
						tempmass += stack.pop();
					}
					// Remove -1 i.e opening bracket
					stack.pop();
					// Add tempMass to stack
					stack.push(tempmass);
					// Check if elem is Digit
				}else if(formula[i].chars().allMatch(Character::isDigit)){
					// get the total bracket sum 
					int tempmass = stack.pop();
					// multiply the inside bracket sum with right side number
					stack.push(tempmass * Integer.parseInt(formula[i]));
				}else if(formula[i].chars().allMatch(Character::isAlphabetic)){
					// If any of H C O molecule push its molecular mass
					int molval = getMolecularMass(formula[i]);
					stack.push(molval);
				}
			}
			
			int molmass = 0;
			while(!stack.isEmpty()){
				molmass += stack.pop();
			}
			
			System.out.println(molmass);
		}
	}

}
