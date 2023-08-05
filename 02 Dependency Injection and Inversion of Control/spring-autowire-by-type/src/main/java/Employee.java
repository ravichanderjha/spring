import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package springautowiringbytype;

public class Employee {
	private String name;
	@Qualifier("mno")
	@Autowired
	private Salary salaryChecker;// this is auto wired

	@Autowired
	private Address sAddress;

	/*
	 * @Autowired 
	 * Employee(SalaryChecker salaryChecker, Address sAddress ) {
	 * this.salaryChecker = salaryChecker; this.sAddress = sAddress; }
	 * 
	 * 
	 * @Autowired 
	 * public void setSalaryChecker( SalaryChecker salaryChecker ) {
	 * this.salaryChecker = salaryChecker; }
	 * 
	 * @Autowired 
	 * public void setSAddress(Address sAddress ) { this.sAddress = sAddress;
	 * }
	 */

	public Salary getSalary() {
		return salaryChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		salaryChecker.checkSalary();
	}
}