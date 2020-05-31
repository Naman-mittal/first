package com.employee;


public class PartF {

	SingleLinkedList empList = new SingleLinkedList();
	public SingleLinkedList newEmployeeStructure(PermanentEmployee[] perm) {

		// ************************************ TODO F2 ************************************
		/*
		 * This method should form a linkedlist containing objects of type
		 * PermanentEmployee and should return the linkedlist
		 *
		 * You are required to implement LinkedList from scratch and add all the objects
		 * of perm array to your linked List
		 *
		 * Uncomment line "TestYourCode.testNewEmployeeStructure(tail)" to test your code
		 * Note : this method takes the tail of type Node of your linkedList as a parameter.
		 *
		 */

		// ************************************ SOLUTION F2 BEGIN ************************************

		//in this we use foreach loop because we store complete peranent employ list
		for (PermanentEmployee permanentEmployee: perm) {
			empList.add(permanentEmployee);
		}
		// Uncomment the line below to test your code
		TestYourCode.testNewEmployeeStructure(empList.tail);
		return empList;
		// ************************************ SOLUTION F2 END ************************************
	}

	public SingleLinkedList addNewEmployee(SingleLinkedList empList, PermanentEmployee perm) {

		// ************************************ TODO F3 ************************************
		/*
		 * This method should add an employee in the linkedlist
		 * and return the updated linkedlist
		 * Note : the linked list remains ordered based on the permanent Ids
		 *
		 * Uncomment line "TestYourCode.testAddNewEmployee(position)" to test your code
		 * Note : this method takes the position of type integer at which the object is added as a parameter
		 *
		 */

		// ************************************ SOLUTION F3 BEGIN ************************************

		Node temp = empList.head;

		int position = 1;
		if(perm.getId() < temp.permanentEmployee.getId()) {
			Node temp1 = empList.head;
			empList.head = new Node(perm);
			empList.head.next = temp1;
		} else {

			while (temp.next != null && temp.next.permanentEmployee.getId() < perm.getId()) {
				position ++;
				temp = temp.next;
			}
			Node temp2 = temp.next;
			temp.next = new Node(perm);
			temp.next.next = temp2;


			if(temp.next.next == null) {
				empList.tailNode = temp.next;
				empList.tail = empList.tailNode.permanentEmployee.getId();
			}
			position++;
		}
		System.out.println();
		TestYourCode.testAddNewEmployee(position);
		return empList;
		// ************************************ SOLUTION F3 END ************************************
	}
	public SingleLinkedList removeAbscondedEmployee(SingleLinkedList empList) {
		// ************************************ TODO F4 ************************************
		/*
		 * This method should remove an employee from the linkedlist
		 * Note : Your task is to print the id of the employee that gets removed.
		 * This method should return the updated linkedlist
		 *
		 * Uncomment the line "TestYourCode.testRemoveAbscondedEmployee(abscondedEmployee)" to test your code
		 * Note : this method takes abscondedEmployee of type Node as a parameter.
		 */
		// ************************************ SOLUTION F4 BEGIN ************************************
		System.out.println();
		return empList;
		// ************************************ SOLUTION F4 END ************************************
	}
}
