package collections;


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ThreadArr implements Runnable{
	
	@Override
	public void run() {
		// ������
		Abonent[] phBookArr = new Abonent[PhoneBookTh.n];

		System.out.println("********************************");

		System.out.println("���������� ������� ��������.");
		Date currentTime = new Date();
		addPhoneBookArr(phBookArr, PhoneBookTh.n);
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // ����������
																	// �������
		System.out.println("���������� ������� ����������� ����� " + msDelay + " ��");

		printAllBookArr(phBookArr); // ��� ���� ���������, ��� ����������

		System.out.println("=========================================");

		System.out.println("����� ������� � ������� �������.");
		currentTime = new Date();
		findNumbersArr(phBookArr, PhoneBookTh.numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("����� ������� ����� " + phBookArr.length + " ������� ������� ���������� ����� " + msDelay + " ��");

		System.out.println("********************************");
		
	}
	
	// ������ �������

	public static void addPhoneBookArr(Abonent[] array, int n) { // ����������

		for (int i = 0; i < n; i++) {

			Random r = new Random();
			String name = "Abonent " + i;
			String number = "+7 ";
			for (int j = 0; j < 10; j++) {
				number += Integer.toString(r.nextInt(9));
			}
			Abonent abon = new Abonent(name, number);
			array[i] = abon;
		}
	}

	public static void findNumbersArr(Abonent[] phB, ArrayList<String> numb) { // �����

		for (int i = 0; i < phB.length; i++) {
			Abonent ab = new Abonent();
			ab = phB[i];
			String currentPhNumber = ab.getPhoneNumber();
			if (numb.contains(currentPhNumber))
				ab.AbonentPrint();
		}

	}

	public static void printAllBookArr(Abonent[] phB) { // ����� ������

		for (int i = 0; i < phB.length; i++) {
			phB[i].AbonentPrint();
		}

	}

}
