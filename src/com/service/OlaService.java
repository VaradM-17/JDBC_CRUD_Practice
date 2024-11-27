package com.service;

import java.util.Scanner;
import com.dao.OlaDao;
import com.entity.OLA;

public class OlaService {

	OlaDao od = new OlaDao();

	public void insertData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Driver ID: ");
		int did = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Driver Name: ");
		String dname = sc.nextLine();

		System.out.println("Enter Driver Age: ");
		int dage = sc.nextInt();

		System.out.println("Enter Vehicle Number: ");
		int vehicalno = sc.nextInt();

		OLA o = new OLA(did, dname, dage, vehicalno);
		od.insertData(o);
	}

	public void updateData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Driver ID to update: ");
		int did = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter New Driver Name: ");
		String dname = sc.nextLine();

		System.out.println("Enter New Driver Age: ");
		int dage = sc.nextInt();

		System.out.println("Enter New Vehicle Number: ");
		int vehicalno = sc.nextInt();

		OLA o = new OLA(did, dname, dage, vehicalno);
		od.updateData(o);
	}

	public void deleteData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Driver ID to delete: ");
		int did = sc.nextInt();

		od.deleteData(did);
	}

	public void displayallData() {
		od.displayallData();
	}
}
