package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JNEXT {
	
	public static final void swap (int[] a, int leftindex, int rightindex) {
		int temp = a[leftindex];
		a[leftindex] = a[rightindex];
		a[rightindex] = temp;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
			
			// Process Array Inputs
			int inputlen = Integer.parseInt(br.readLine());
			String[] inputs = br.readLine().trim().split("\\s+");
			int[] inputarr = Arrays.asList(inputs).stream().mapToInt(Integer::parseInt).toArray();
			
			// Start checking elem from last of array
			int smallElemIndex = -1;
			for(int i = inputlen - 2; i >=0 ; i--){
				if(inputarr[i] < inputarr[i+1]){
					smallElemIndex = i;
					break;
				}
			}
			
			// If no small element found from behind
			// I.E Array is in Descending order
			if(smallElemIndex == -1) {
				System.out.println("-1");
				continue;
			}
			
			// Find the smallest element from the swaping index (smallElemIndex)
			int minElemIndex = inputlen-1;
			for(int j = smallElemIndex+1; j<inputlen; j++){
				if(inputarr[j] <= inputarr[smallElemIndex]){
					minElemIndex = j;
					break;
				}
			}
			
			// Swap the smallest Index with Min Elem from right side
			swap(inputarr, smallElemIndex, minElemIndex);
			
			// Sort the right part
			Arrays.sort(inputarr, smallElemIndex + 1, inputlen);
			
			for(int val: inputarr){
				System.out.print(val);
			}
		}
	}
}
