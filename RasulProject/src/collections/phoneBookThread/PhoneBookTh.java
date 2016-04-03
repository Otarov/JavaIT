package collections.phoneBookThread;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PhoneBookTh {

	static ArrayList<String> numbers = new ArrayList<>();
	public static int n = 1000000; // ���������� ���������

	public static void main(String[] args) throws InterruptedException { // ������� �����
		addNumbers(numbers);
		Date beginTime = new Date();
		ThreadSet thS = new ThreadSet();
		ThreadMap thM = new ThreadMap();
		ThreadArr thA = new ThreadArr();
		thS.run(); // ������ ����� � ���������� (1 �����)
//		thS.wait();
		thM.run(); // ������ ����� � ������ (2 �����)
//		thM.wait();
		thA.run(); // ������ ����� � �������� (3 �����)
//		thA.wait();

		// ������
		ArrayList<Abonent> phBookList = new ArrayList<>();

		System.out.println("********************************");

		System.out.println("���������� ������ ��������.");
		Date currentTime = new Date();
		addPhoneBookList(phBookList, n);
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // ����������
																	// �������
		System.out.println("���������� ������ ����������� ����� " + msDelay + " ��");

//		 printAllBook(phBookList); // ��� ���� ���������, ��� ����������

		System.out.println("=========================================");

		System.out.println("����� ������� �������.");
		currentTime = new Date();
		findNumbersL(phBookList, numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("����� ������� ����� " + phBookList.size() + " ������� ���������� ����� " + msDelay + " ��");

		System.out.println("********************************");

		System.out.println("***** ���� �������� (��������������) *****");
		
		newTime = new Date();
		msDelay = newTime.getTime() - beginTime.getTime();
		System.out.println("***** " + msDelay + " �� *****");

	}

	public static void addNumbers(List<String> numbers) {

		numbers.add("89280348756");
		numbers.add("89280248756");
		numbers.add("89280058756");
		numbers.add("89280041756");
		numbers.add("89280048256");
		numbers.add("89280048746");
		numbers.add("89280048750");
	}

	// ������ ������
	public static void addPhoneBookList(ArrayList<Abonent> phBookList, int n) { // ����������

		for (int i = 0; i < n; i++) {

			Random r = new Random();
			String name = "Abonent " + i;
			String number = "+7 ";
			for (int j = 0; j < 10; j++) {
				number += Integer.toString(r.nextInt(9));
			}
			Abonent abon = new Abonent(name, number);
			phBookList.add(abon);
		}
	}

	public static void findNumbersL(ArrayList<Abonent> phB, ArrayList<String> numb) { // �����

		for (Iterator<Abonent> iter = phB.iterator(); iter.hasNext();) {
			Abonent ab = new Abonent();
			ab = iter.next();
			String currentPhNumber = ab.getPhoneNumber();
			if (numb.contains(currentPhNumber))
				ab.AbonentPrint();
		}

	}

	public static void printAllBook(ArrayList<Abonent> phB) { // ����� ������

		for (Iterator<Abonent> iter = phB.iterator(); iter.hasNext();) {
			Abonent ab = new Abonent();
			ab = iter.next();
			ab.AbonentPrint();
		}

	}

}
