/* Filename: Employee.java
 * 
 * Purpose: Describes Employee class
 * 
 * Last Modified: 2017 Dec 4
 */

public class Employee 
{
	//private class variables
	private String employeeID;
	private double hoursPerWeek;
	private double hourlyPayRate;
	private double grossWages;
	
	//default constructor
	public Employee()
	{
		employeeID = " ";
		hoursPerWeek = 0.0;
		hourlyPayRate = 0.0;
		grossWages = 0.0;
	}
	
	//Constructor with employee ID input
	public Employee(String empID)
	{
		employeeID = empID;
	}
	
	//set employeeID
	public void setEmployeeID(String empID)
	{
		employeeID = empID;
	}
	
	//hours per week setter
	public void setHoursPerWeek(double empHours)
	{
		hoursPerWeek = empHours;
	}
	
	//hourly pay rate setter
	public void setHourlyPayRate(double empPayRate)
	{
		hourlyPayRate = empPayRate;
	}
	
	//set gross wages - no input 
	//only perform multiplication
	public void setGrossWages()
	{
		grossWages = hoursPerWeek * hourlyPayRate;
	}
	
	//employee ID getter
	public String getEmployeeID()
	{
		return employeeID;
	}
	
	//hours per week getter
	public double getHoursPerWeek()
	{
		return hoursPerWeek;
	}
	
	//Gross Wages getter
	public double getGrossWages()
	{
		return grossWages;
	}
	
	public void printEmployee(Employee emp)
	{
		System.out.format("%-15s%-10.2f$%-10.2f$%-10.2f%n", employeeID, hoursPerWeek, hourlyPayRate, grossWages);
	}

}
