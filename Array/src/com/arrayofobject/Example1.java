package com.arrayofobject;
class Employee
{
	int id;
	String name;
	double salary;
	public Employee()
	{
		
	}
	public Employee(int id,String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return "Emp id:"+id+"Emp name: "+name+"Salary: "+salary;                        
	}

}

public class Example1 {

}
