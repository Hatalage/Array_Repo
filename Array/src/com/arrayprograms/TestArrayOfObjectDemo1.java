package com.arrayprograms;
class Food
{
	int foodid;
	String foodname;
	double foodprice;
	double foodprise;
	public Food(int foodid,String foodname,double foodprise)
	{
		this.foodid=foodid;
		this.foodname=foodname;
		this.foodprise=foodprise;
	}
	public void setFoodid(int foodid)
	{
		this.foodid=foodid;
	}
	public int getFoodid()
	{
		return foodid;
	}
	public void setFoodname(String foodname)
	{
		this.foodname=foodname;
	}
	public String getFoodname()
	{
		return foodname;
	}
	public void setFoodprise(double foodprise)
	{
		this.foodprise=foodprise;
	}
	public double getFoodprise()
	{
		return foodprise;
	}
	@Override
	public String toString() {
		return "Food [foodid=" + foodid + ", foodname=" + foodname + ", foodprice=" + foodprice + ", foodprise="
				+ foodprise + "]";
	}
	
}
public class TestArrayOfObjectDemo1 {
public static void main(String[] args) {
	Food foods[]=new Food[5];

	foods[0]=new Food(1,"Pav Bhaji",150);
	foods[1]=new Food(2,"Dosa",155);
	foods[2]=new Food(3,"Tea",15);
	foods[3]=new Food(4,"Biryani",400);
	foods[4]=new Food(5,"Gulab-Jamun",100);

	System.out.println("------Food details by loop------");
	for(int i=0;i<foods.length;i++)
	{
	System.out.println(foods[i].getFoodid());
	System.out.println(foods[i].getFoodname());
	System.out.println(foods[i].getFoodprise());
}
	System.out.println("--------food details by for-each loop----");
	for(Food f:foods)
	{
		System.out.println(f.getFoodid());
		System.out.println(f.getFoodname());
		System.out.println(f.getFoodprise());
	}

}
}
