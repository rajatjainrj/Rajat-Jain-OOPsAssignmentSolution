package com.greatlearning.oops.driver;

import com.greatlearning.oops.departments.AdminDepartment;
import com.greatlearning.oops.departments.HrDepartment;
import com.greatlearning.oops.departments.TechDepartment;

public class Main {
	
	static String welcomePrefix = "Welcome to ";

	public static void main(String[] args) {
		
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println(welcomePrefix + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		
		System.out.println();
		
		HrDepartment hrDepartment = new HrDepartment();
		System.out.println(welcomePrefix + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		
		System.out.println("\n");
		
		TechDepartment techDepartment = new TechDepartment();
		System.out.println(welcomePrefix + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
	}

}
