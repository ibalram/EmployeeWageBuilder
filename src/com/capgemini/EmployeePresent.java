package com.capgemini;

public class EmployeePresent {

	public static void main(String[] args) {
		double check = Math.floor(Math.random()*10)%2;
		if (check==1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}
