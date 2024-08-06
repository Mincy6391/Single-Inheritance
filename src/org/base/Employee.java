package org.base;

public class Employee extends Company{
private void empName() {
	System.out.println("Emp name is Ram");
}
public static void main(String[] args) {
	Employee a =new Employee();
	a.empName();
	a.companyName();
}

}

