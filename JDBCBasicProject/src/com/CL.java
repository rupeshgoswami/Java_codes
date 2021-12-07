package com;

import java.util.Scanner;

public class CL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id ");
		//String idd= sc.nextLine();
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter add :");
		String add = sc.nextLine();
		
		
		UserDAO userDAO=new UserDAO();
		if(userDAO.insertData(id, name, add))
		{
			System.out.println("succes");
		}
		else
		{
			System.out.println("not inserted");
		}
		
		
	}

}
