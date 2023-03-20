package test;

import java.util.Scanner;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		age=sc.nextInt();
		if(age<=17)
		
		{
			System.out.println("Not eligible for voting");
		}
		else
		{
			System.out.println("eligible for voting");
		}
		sc.close();
	}
	

}
