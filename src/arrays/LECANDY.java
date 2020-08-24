package arrays;

import java.util.Scanner;

public class LECANDY {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		while(testcases > 0){
		    int elephant = sc.nextInt();
		    int candies = sc.nextInt();
		    sc.next();
		    int[] candiesArr = new int[elephant];
		    for(int i=0; i<candiesArr.length; i++){
		    	candiesArr[i] = sc.nextInt();
		    }
		    int totalCandies = 0;
		    for(int i=0; i<candiesArr.length; i++){
		      totalCandies += candiesArr[i];
		    }
		    String result = totalCandies > candies ? "No" : "Yes";
		    System.out.println(result);
		    testcases--;
		}
		sc.close();
	}

}
