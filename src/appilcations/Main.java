package appilcations;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.Employee;
import entitties.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner  sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of emplyees: ");
		int number = sc.nextInt();
		
		for(int i = 0;i < number;i++) {
			System.out.println("Enployee #" + i+1 + " data:");
			System.out.print("Outsourced (y/n)? ");
			char option = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(option == 'y') {
				System.out.print("Additional charge: ");
				double additionaCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionaCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("EMPLOYEES:");
		for(Employee emp: list) {
			System.out.println(emp.getName()+ " - $"+ String.format("%.2f", emp.payment()));
		}
		

	}

}
