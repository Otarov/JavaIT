package collections;


import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ThreadArr implements Runnable{
	
	@Override
	public void run() {
		// массив
		Abonent[] phBookArr = new Abonent[PhoneBookTh.n];

		System.out.println("********************************");

		System.out.println("Заполнение массива началось.");
		Date currentTime = new Date();
		addPhoneBookArr(phBookArr, PhoneBookTh.n);
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // вычисление
																	// разницы
		System.out.println("Заполнение массива завершилось через " + msDelay + " мс");

		printAllBookArr(phBookArr); // это если интересно, что получилось

		System.out.println("=========================================");

		System.out.println("Поиск номеров в массиве начался.");
		currentTime = new Date();
		findNumbersArr(phBookArr, PhoneBookTh.numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("Поиск номеров среди " + phBookArr.length + " записей массива завершился через " + msDelay + " мс");

		System.out.println("********************************");
		
	}
	
	// методы массива

	public static void addPhoneBookArr(Abonent[] array, int n) { // заполнение

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

	public static void findNumbersArr(Abonent[] phB, ArrayList<String> numb) { // поиск

		for (int i = 0; i < phB.length; i++) {
			Abonent ab = new Abonent();
			ab = phB[i];
			String currentPhNumber = ab.getPhoneNumber();
			if (numb.contains(currentPhNumber))
				ab.AbonentPrint();
		}

	}

	public static void printAllBookArr(Abonent[] phB) { // вывод списка

		for (int i = 0; i < phB.length; i++) {
			phB[i].AbonentPrint();
		}

	}

}
