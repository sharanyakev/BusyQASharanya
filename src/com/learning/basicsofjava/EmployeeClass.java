package com.learning.basicsofjava;

public class EmployeeClass {
	int eid;
	String ename;
	double sal;
	String job;
	
	
	void display() {
		System.out.println("Displaying complete information of the current Object");
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(job);
	}
	
	void bonus() {
		System.out.println((sal*10)/100);
	}
}