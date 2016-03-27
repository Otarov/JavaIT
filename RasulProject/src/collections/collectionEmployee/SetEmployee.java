package collections.collectionEmployee;

import java.io.*;
import java.util.*;

public class SetEmployee {

	public static void main(String[] args) throws IOException {

		Set<Employee> employees = new HashSet<Employee>();

		InputEmployee(employees, 5);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���������� � ����� ������ �������?");
		int workAge = Integer.parseInt(reader.readLine());
		System.out.println("���������: ");
		//printEmployee(employees, workAge);		

		 printEmployeeWithIterator(employees, workAge);

	}

//	private static void printEmployee(Set<Employee> employees, int workAge) {
//		for (Employee empl : employees) {
//			if (empl.getWorkAge() == workAge)
//				System.out.println(empl.getName());
//		}

//	}

	public static void InputEmployee(Set<Employee> spisok, int k) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < k; i++) {
			System.out.println("������� ������ ���������:");
			System.out.print("���: ");
			String name = reader.readLine();
			System.out.print("����: ");
			String sAge = reader.readLine();
			int nAge = Integer.parseInt(sAge);
			Employee emp = new Employee(name, nAge);
			spisok.add(emp);

		}
	}

	public static void printEmployeeWithIterator(Set<Employee> employees, int wA) {
		for (Iterator<Employee> iter = employees.iterator(); iter.hasNext();) {
			
			if (iter.next().getWorkAge() == wA)
//				System.out.println(employees.getName());		// ��� ��� ��� �������� ��� �������� ���������?	
				System.out.println("���� ����� ��������!");		// ���� � ��� ������ ��� iter.next().getWorkAge(),
		}														// ��� � �������, �������� ���������� ��� �� ���� �������...
	}

}
