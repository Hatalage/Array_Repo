package com.arrayofobject;

public class MyDate {
private int day;
private String month;
private int year;

public MyDate(int day, String month, int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
}
public void setDay(int day)
{
	this.day=day;
}
public void setMonth(String month)
{
	this.month=month;
}
public void setYear(int year)
{
	this.year=year;
}
public int getDay()
{
	return day;
}
public String  getMonth()
{
	return month;
}
public int getYear()
{
	return year;
}
@Override
public String toString() {
	return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
}
}
