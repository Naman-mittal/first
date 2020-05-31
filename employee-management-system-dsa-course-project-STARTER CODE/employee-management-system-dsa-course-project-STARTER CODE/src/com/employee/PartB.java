package com.employee;

public class PartB {

	public void searchForAnEmployee(PermanentEmployee[] perm, int id) {
		// ************************************ TODO B1 ************************************
		/*
		 * This method should print the contact number of corresponding employee if
		 * present else the method should print : "Employee not in the records"
		 * 
		 * Uncomment the line containing "TestYourCode.testSearchForAnEmployee(str)" to test your code 
		 * Note : str is the contact number of the corresponding employee;
		 */
		
		// ************************************ SOLUTION B1 BEGIN ************************************
		int first=0;
		String str = null;
		int last=perm.length-1;
		int mid = (first + last)/2;
		while( first <= last ){
			if (perm[mid].getId() < id) {
				first = mid + 1;
			} else {
				if (id == perm[mid].getId()){
					str=perm[mid].getContact();
					System.out.println(str);
					break;
				}else{
					last = mid - 1;
				}
			}
			mid = (first + last)/2;
		}
		if ( first > last ){
			System.out.println("Employee not in the records");
		}
		/* Uncomment below line to test your code */
		TestYourCode.testSearchForAnEmployee(str);

		// ************************************ SOLUTION B1 END ************************************
	}
}
