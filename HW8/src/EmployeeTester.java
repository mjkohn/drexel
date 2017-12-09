/* Filename: EmployeeTester.java
 * 
 * Purpose: Calculates payroll for employees
 * Fist: Program asks user to enter all employee ID
 * Second: User enters hours worked and hourly pay rate
 * Third: Program calculates gross wages for employees
 * Fourth: Program prints out information for all employees.
 * 
 * Last Modified: 2017 Dec 4
 */

//Imports for Employee Tester
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeTester 
{
	
	//Prints Employee Header
	public static void printEmployeeHeader()
	{
		System.out.println("----------------------------------------");
		System.out.format("%-15s%-10s%-10s%-10s%n", "Employee ID", "Hours", "Rate", "Wages");
		System.out.println("----------------------------------------");
	}
	
	public static void main(String[] args) 
	{
		//Instantiate Scanner Object
		Scanner sc = new Scanner(System.in);
		String employeeIDInput = " ";
		double employeeHoursWorked;
		double employeeHourlyPayRate;
		
		//Create linked list
		LinkedList<Employee> empList = new LinkedList<Employee>();
		
		//Add employees to linked list
		//Quit if user enters 000
		while (!employeeIDInput.equals("000"))
		{
			//Get Employee ID from user
			System.out.print("Enter and employeeID or 000 to stop: ");
			employeeIDInput = sc.nextLine();
					
			//add employee if input not 000
			if (!employeeIDInput.equals("000"))
			{
				//Check for blank input
				if (employeeIDInput.equals(" ") || employeeIDInput.equals(""))
				{
					//Print out error message
					System.out.println("Error. Employee ID cannot be empty!");
				}
				else
				{
					//Add employeeID to list
					empList.add(new Employee(employeeIDInput));
				}
			}
			
		} //end while (!employeeIDInput.equals("000"))
		
		//Add rest of employee data
		for (Employee emp:empList)
		{
			do
			{
				//Get hours worked 
				System.out.print("Please enter total number of hours worked for employee " + emp.getEmployeeID() + ": ");
				//try/catch for Scanner input mismatch exception
				try
				{
					employeeHoursWorked = sc.nextDouble();
					//Check if hours entered greater than zero
					if (employeeHoursWorked < 0)
					{
						//Print error
						System.out.println("Error! The number of hours must be zero or greater!");
					}
					else
					{
						//set hours for employee
						emp.setHoursPerWeek(employeeHoursWorked);
						System.out.println(" ");
					}
				}//end try
				//Catch input mismatch error
				catch (InputMismatchException e)
				{
					//output error message
					System.out.println("Error! Input must be a number!");
					//Clears input that caused error to avoid infinite loop
					sc.next();
					//set employeeHoursWorked to -1 to go through loop again
					employeeHoursWorked = -1;
				}//end catch
				
			}while(employeeHoursWorked < 0);
			
			do
			{
				//get hourly wage for employee
				System.out.print("Please enter hourly wage for employee " + emp.getEmployeeID() + ": ");
				
				try
				{
					employeeHourlyPayRate = sc.nextDouble();
					//Ensure hourly wage greater then 6.00
					if (employeeHourlyPayRate < 6.00)
					{
						//Print out error
						System.out.println("Error! Enter a hourly pay rate of 6.00 or greater!");
					}
					else
					{
						//Set hourly pay rate
						emp.setHourlyPayRate(employeeHourlyPayRate);
						//Calc gross wages for employee
						emp.setGrossWages();
						System.out.println(" ");
					}
					
				}//end try
				//Catch input mismatch error
				catch (InputMismatchException e)
				{
					//output error message
					System.out.println("Error! Input must be a number!");
					//Clears input that caused error to avoid infinite loop
					sc.next();
					//set employeeHoursWorked to -1 to go through loop again
					employeeHourlyPayRate = -1;
				}//end catch
				
				
			} while(employeeHourlyPayRate < 6.00);
			
			
		} //end adding employee data
		
		//Print out header
		printEmployeeHeader();
		
		//Print employee data
		for (Employee e:empList)
		{
			e.printEmployee(e);
		}
		
		//Inform user Payroll calcs have ended
		System.out.println("Payroll Complete");
		
		//Close scanner
		sc.close();
		
	} //end main

}
