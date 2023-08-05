package com.arrayofobject;

public class EmpDeptMain {
		public static void main(String[] args) {


			Department2 mech= new Department2(101, "Mechanical");
			Department2 it = new Department2(102, "IT");
			Department2 sales = new Department2(103, "Sales");
			Department2 hr = new Department2(104, "hr");
			Employee2[] e = new Employee2[10];

			e[0] = new Employee2(1, "Ram", 15000, it);
			
			e[1] = new Employee2(2, "Sam", 30000, mech);
			e[2] = new Employee2(3, "Sai", 30000, mech);
			e[3] = new Employee2(4, "Danish", 30000, mech);
			
			e[4] = new Employee2(5, "Jamuna", 25000,sales);
			e[5] = new Employee2(6, "Waman", 30000,sales);
			e[6] = new Employee2(7, "Amar", 35000,sales);
			
			e[7] = new Employee2(7, "Yamuna", 25000,hr);
			e[8] = new Employee2(8, "Uma", 30000,hr);
			e[9] = new Employee2(9, "Om", 35000,hr);
			
			System.out.println(e[0].getId());
			System.out.println(e[1].getDepartment().getDname());

			// 4.for Employees which are working in sales department
			for (Employee2 em : e) {
				if(em.getDepartment().getDid()==103)
				{
					System.out.println(em);
				}
			}
			System.out.println("--------------------------------------------------");
			// 5. print employees those works in same department
			int count=0;
			for(int i=0;i<e.length;i++)
			{
				
				for(int j=i+1;j<e.length;j++)
				{
					if(e[i].getDepartment().getDid()==e[j].getDepartment().getDid())
					{
						
						
							count++;

							System.out.println(e[i]);
						
					}
					
				}
			}
			
			
		}
	}

