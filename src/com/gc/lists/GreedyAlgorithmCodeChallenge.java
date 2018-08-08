package com.gc.lists;

public class GreedyAlgorithmCodeChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 532;
		int[] money = {100, 50, 20, 5, 1};

		if(amount != 0) {
			for (int i = 0; i < money.length; i++ ) {
				//int remainingMoney = amount % money[i];
				int numBills = amount/money[i];
				amount = amount % money[i];
				System.out.println(numBills + " $" + money[i]);
			}
		}
		
		int [] nums = {1,2,3,2,2,4,5,5,7,8,4,4,1,0,10};
		//store totals in an array
		int [] totals = new int [11];
		//use a for loop to iterate through the numbers being checked in the array
		for (int i = 0; i < nums.length; i++) {
			// set a counter for the numbers
			int iCount = 0;
			// a second for loop to iterate through the array indices themselves
			for (int j = 0; j < nums.length; j++) {
				// checking the array for all matches to a number equal to i
				if(nums[j] == i) {	
					// increment i if they are equal
					iCount++;	
				}
			}
			// set the totals array at index i to the total number of occurences of the i value
			totals[i]= iCount;
			// print out the results
			System.out.println(totals[i] + " " + i +"'s ");
		}

	}

}
