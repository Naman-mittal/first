package com.employee;

public class PartC {

	public PermanentEmployee[] getHighestToMedianSalary(PermanentEmployee[] perm) {
		// ************************************ TODO C1 ************************************
		/*
		 * This method should print the ratio of Highest Salary to Median Salary of the permanent employees
		 * 
		 * This method should return a sorted array of the PermanentEmployee, based on compensation.
		 * 
		 * 
		 * Uncomment the line "TestYourCode.testHighestToMedianSalary(ratio)" to test your code 
		 * Note : Pass the desired ratio as a float value
		 */
		// ************************************ SOLUTION C1 BEGIN ************************************
		float ratio;
		for(int i=0;i<perm.length-1;i++){
			for (int j=0;j<perm.length-i-1;j++)
			{
				if(perm[j].getCompensation()>perm[j+1].getCompensation()){
					PermanentEmployee t=perm[j];
					perm[j]=perm[j+1];
					perm[j+1]=t;

				}
			}
		}
		int maximun=0;
		float median;
		median=perm[perm.length/2].getCompensation();
		 maximun=perm[perm.length-1].getCompensation();

		ratio=maximun/median;
		System.out.println(ratio);

		// Uncomment the line below to test your code
		 TestYourCode.testHighestToMedianSalary(ratio);

		return perm;

		// ************************************ SOLUTION C1 END ************************************
	}
}
