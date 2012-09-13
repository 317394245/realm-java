package com.tightdb.example;

import java.util.Date;

public class HelloWorld {

	@Table(row = "Employee")
	class employee {
		String firstName;
		String lastName;
		int salary;
		boolean driver;
		byte[] photo;
		Date birthdate;
		Object extra;
		phone phones;
	}

	@Table(row = "Phone")
	class phone {
		String type;
		String number;
	}

	public static void main(String[] args) {
		EmployeeTable employees = new EmployeeTable(group);

		Employee john = employees.add("John", "Doe", 10000, true, new byte[] {
				1, 2, 3 }, new Date(), "extra");

		TightDB.print("Employees", employees);
		TightDB.print("Johny", johny);
	}

}
