package com.employee;

//************************************ TODO 1.2 ************************************
//Implement ContractEmployee class which inherits the properties of Employee class

public class ContractEmployee extends Employee {
    //************************************ SOLUTION 1.2 BEGIN ************************************
    public ContractEmployee(int id, String name, int age, String contact, int compensation, int rating, String extraField) {
        super(id, name, age, contact, compensation, rating);
    }//************************************ SOLUTION 1.2 END **************************************
}
