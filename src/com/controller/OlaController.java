package com.controller;

import java.util.Scanner;
import com.service.OlaService;

public class OlaController {

	public static void main(String[] args) {
		OlaService os = new OlaService();
		int option;

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Ola Booking Driver Details");
			System.out.println("1. Insert New Driver Data");
			System.out.println("2. Update Existing Driver Data");
			System.out.println("3. Delete Driver Data");
			System.out.println("4. Display All Driver Records");
			System.out.println("5. Exit Program");

			System.out.print("Choose Option : ");

			option = sc.nextInt();

			switch (option) {
			case 1:
				os.insertData();
				break;
			case 2:
				os.updateData();
				break;
			case 3:
				os.deleteData();
				break;
			case 4:
				os.displayallData();
				break;
			case 5:
				System.out.println("...... Program Exited .....");
				break;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		} while (option != 5);
	}
}
