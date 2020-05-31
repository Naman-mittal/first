package com.employee;

import java.util.Arrays;

public class PartD {

	public ContractEmployee[] getHighestContractSalaries(ContractEmployee[] conSal) {
		// ************************************ TODO D1 ************************************
		/*
		 * This method should print the TOP FIVE Compensations of the Contract Employees.
		 * This method should return a sorted array of ContractEmployee based on compensation
		 *
		 * Uncomment the line "TestYourCode.testHighestContractSalaries(topFive)" to test your code
		 * Note : topFive is an integer array that consists of all the top 5 Compensations
		 *
		 * Uncomment the line "TestYourCode.testSortedContractSalaries(conSal)" to test your code
		 * Note : conSal is the Sorted Array of Contract Employees
		 *
		 */
		// ************************************ SOLUTION D1 BEGIN ************************************
		int[] topFive=new int[5];
		PartD obj=new PartD();
		obj.sort(conSal,0,conSal.length-11);
		for(int i=0;i<5;i++)
		{topFive[i]=conSal[i].getCompensation();
		System.out.println(topFive[i]);
		}

		// Uncomment the line below to test your code
		TestYourCode.testHighestContractSalaries(topFive);
		return conSal;

	}
// this methors implement the Quicksort
	private void sort(ContractEmployee[] conSal, int low, int high) {

		if (low < high)
		{
			int pi = partition(conSal, low, high);
			// Recursively sort elements before
			// partition and after partition
			sort(conSal, low, pi-1);
			sort(conSal, pi+1, high);
		}

	}
	private int partition(ContractEmployee[] conSal, int low, int high) {

		int pivot =conSal[high].getCompensation();
		int i = (low-1); // index of smaller element
		for (int j=low; j<high; j++)
		{
			// If current element is smaller than the pivot
			if (conSal[j].getCompensation() > pivot)
			{
				i++;
				ContractEmployee temp = conSal[i];
				conSal[i]= conSal[j];
				conSal[j] = temp;
			}
		}

		// swap arr[i+1] and arr[high] (or pivot)
		ContractEmployee temp = conSal[i+1];
		conSal[i+1] = conSal[high];
		conSal[high] = temp;

		return i+1;
	}
//************************************ SOLUTION D1 END ************************************

	public void unionOfSalaries(PermanentEmployee[] sortedPerm, ContractEmployee[] sortedCon) {
		// ************ TODO D2 ************
		/* This method should print the ratio of Highest to Median Compensation of all employees
		 *
		 *Uncomment the line "TestYourCode.testUniteSalaries(ratio)" to test your code
		 *Note : ratio is a float value
		 *
		 */
		//************ SOLUTION D2 BEGIN ************
		int arrayFinal[] = new int[sortedPerm.length + sortedCon.length];
		int len1 = sortedPerm.length;
		int len2 = sortedCon.length;
		int len3 = len1 + len2;
		int i = 0, j = 0, k = 0;

		while (i<len1 && j <len2)
		{
			if (sortedPerm[i].getCompensation() < sortedCon[j].getCompensation())
				arrayFinal[k++] = sortedPerm[i++].getCompensation();
			else
				arrayFinal[k++] = sortedCon[j++].getCompensation();
		}
		while (i < len1)
			arrayFinal[k++] = sortedPerm[i++].getCompensation();
		while (j < len2)
			arrayFinal[k++] = sortedCon[j++].getCompensation();
		Arrays.sort(arrayFinal);

		float ratio;
		float medianCompensation;
		float highestCompensation = arrayFinal[len3-1];
		if(len3 % 2 == 0){
			medianCompensation = (arrayFinal[(len3 - 1) / 2] + arrayFinal[len3 / 2]) / 2;
		}
		else
			medianCompensation = arrayFinal[len3 / 2];


		ratio = highestCompensation / medianCompensation;
		System.out.println(ratio);



		// Uncomment the line below to test your code
		TestYourCode.testUniteSalaries(ratio);

		//************ SOLUTION D2 END ************
	}
}