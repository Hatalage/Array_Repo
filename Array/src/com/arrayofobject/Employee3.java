package com.arrayofobject;

public class Employee3 {
private int eid;
private String ename;
private double salary;
public MyDate joining_date;

public Employee3(int eid,String ename,double salary,MyDate joining_date)
{
	this.eid=eid;
	this.ename=ename;
	this.salary=salary;
	this.joining_date=joining_date;
}
public void setEid(int eid) {
	this.eid = eid;
}

public void setEname(String ename) {
	this.ename = ename;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void setJoining_date(MyDate joining_date) {
	this.joining_date = joining_date;
}

public int getEid() {
    return eid;
}

public String getEname() {
    return ename;
}

public double getSalary() {
    return salary;
}

public MyDate getJoining_date() {
    return joining_date;
}
@Override
public String toString() {
	return "Employee3 [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
}


}
