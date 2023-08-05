package com.arrayofobject;

public class EmpMydateMain {
public static void main(String[] args) {
//	MyDate m1=new MyDate(12,"August",2023);
//	MyDate m2=new MyDate(22,"october",2000);
//	MyDate m3=new MyDate(07,"July",2022);
//	MyDate m4=new MyDate(22,"october",2000);
//	
	Employee3[] e = new Employee3[7];
	
	e[0] = new Employee3(1,"sita",30000,new MyDate(12,"August",2023));
	
	e[1] = new Employee3(2, "Sam", 30000, new MyDate(22,"october",2000));
	e[2] = new Employee3(3, "Sai", 30000, new MyDate(07,"July",2022));
	e[3] = new Employee3(4, "Danish", 30000, new MyDate(22,"october",2000));
	
	e[4] = new Employee3(5, "Jamuna", 25000,new MyDate(12,"August",2023));
	e[5] = new Employee3(6, "Waman", 30000,new MyDate(22,"october",2000));
	e[6] = new Employee3(7, "Amar", 35000,new MyDate(22,"october",2000));
	
	// 6.for employees who joined after 2010
				for(int i=0;i<e.length;i++) {
					if(e[i].joining_date.getYear()>2010)
					{
						System.out.println(e[i]);
					}
				}
				System.out.println("-------------------------------------------------");
	//7. printing employees who has same joining dates
				for(int j = 0; j < e.length; j++)
				{
					for(int k = j+1; k < e.length; k++)
					{
					if(e[j].getJoining_date().getDay()== e[k].getJoining_date().getDay() && e[j].getJoining_date().getMonth() == e[k].getJoining_date().getMonth() && e[j].getJoining_date().getYear() == e[k].getJoining_date().getYear())
					{
						System.out.println(e[k].getJoining_date() + "\n" + e[j].getJoining_date());
					}
					}
					  
				

}
}
}

