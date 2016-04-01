package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class PhoneBook {

	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<>();
		addNumbers(numbers);

		int n = 1000000;   // количество элементов
		// списки
		ArrayList<Abonent> phBookList = new ArrayList<>();

		System.out.println("********************************");

		System.out.println("Заполнение списка началось.");
		Date currentTime = new Date();
		addPhoneBookList(phBookList, n);
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // вычисление
																	// разницы
		System.out.println("Заполнение списка завершилось через " + msDelay + " мс");

		// printAllBook(phBookList); // это если интересно, что получилось

		System.out.println("=========================================");

		System.out.println("Поиск номеров начался.");
		currentTime = new Date();
		findNumbersL(phBookList, numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("Поиск номеров среди " + phBookList.size() + " записей завершился через " + msDelay + " мс");

		System.out.println("********************************");
		// множество
		Set<Abonent> phBookSet = new HashSet<>();

		System.out.println("Заполнение множества началось.");
		currentTime = new Date();
		addPhoneBookSet(phBookSet, n);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime(); // вычисление
																// разницы
		System.out.println("Заполнение множества завершилось через " + msDelay + " мс");

//		printAllBook(phBookList);
		System.out.println("=========================================");

		System.out.println("Поиск номеров начался.");
		currentTime = new Date();
		findNumbersS(phBookSet, numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("Поиск номеров среди " + phBookList.size() + " записей завершился через " + msDelay + " мс");

		System.out.println("********************************");
		// карта
		Map<String, Abonent> phBookMap = new HashMap<>();

		System.out.println("Заполнение карты началось.");
		currentTime = new Date();
		addPhoneBookMap(phBookMap, n);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime(); // вычисление
																// разницы
		System.out.println("Заполнение карты завершилось через " + msDelay + " мс");

//		printAllBookM(phBookMap);

		System.out.println("=========================================");
		System.out.println("Поиск номеров начался.");
		currentTime = new Date();
		findNumbersL(phBookList, numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("Поиск номеров среди " + phBookList.size() + " записей завершился через " + msDelay + " мс");
		
		
		// массив
				Abonent[] phBookArr = new Abonent[n];

				System.out.println("********************************");

				System.out.println("Заполнение массива началось.");
				currentTime = new Date();
				addPhoneBookArr(phBookArr, n);
				newTime = new Date();
				msDelay = newTime.getTime() - currentTime.getTime(); // вычисление
																			// разницы
				System.out.println("Заполнение массива завершилось через " + msDelay + " мс");

				// printAllBookArr(phBookArr); // это если интересно, что получилось

				System.out.println("=========================================");

				System.out.println("Поиск номеров начался.");
				currentTime = new Date();
				findNumbersArr(phBookArr, numbers);
				newTime = new Date();
				msDelay = newTime.getTime() - currentTime.getTime();
				System.out.println("Поиск номеров среди " + phBookList.size() + " записей завершился через " + msDelay + " мс");

				System.out.println("********************************");
				System.out.println("***** ТЕСТ ЗАВЕРШЕН *****");
				
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

	// методы списка
	public static void addPhoneBookList(ArrayList<Abonent> phBookList, int n) { // заполнение

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

	public static void findNumbersL(ArrayList<Abonent> phB, ArrayList<String> numb) { // поиск

		for (Iterator<Abonent> iter = phB.iterator(); iter.hasNext();) {
			Abonent ab = new Abonent();
			ab = iter.next();
			String currentPhNumber = ab.getPhoneNumber();
			if (numb.contains(currentPhNumber))
				ab.AbonentPrint();
		}

	}

	public static void printAllBook(ArrayList<Abonent> phB) { // вывод списка

		for (Iterator<Abonent> iter = phB.iterator(); iter.hasNext();) {
			Abonent ab = new Abonent();
			ab = iter.next();
			ab.AbonentPrint();
		}

	}

	// методы множества

	public static void addPhoneBookSet(Set<Abonent> phBookList, int n) {

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

	public static void findNumbersS(Set<Abonent> phB, ArrayList<String> numb) {

		for (Iterator<Abonent> iter = phB.iterator(); iter.hasNext();) {
			Abonent ab = new Abonent();
			ab = iter.next();
			String currentPhNumber = ab.getPhoneNumber();
			if (numb.contains(currentPhNumber))
				ab.AbonentPrint();
		}

	}

	public static void printAllBookS(Set<Abonent> phB) {

		for (Iterator<Abonent> iter = phB.iterator(); iter.hasNext();) {
			Abonent ab = new Abonent();
			ab = iter.next();
			ab.AbonentPrint();
		}

	}

	// методы карты
	public static void addPhoneBookMap(Map<String, Abonent> phBookList, int n) {

		for (int i = 0; i < n; i++) {

			Random r = new Random();
			String name = "Abonent " + i;
			String number = "+7 ";
			for (int j = 0; j < 10; j++) {
				number += Integer.toString(r.nextInt(9));
			}
			Abonent abon = new Abonent(name, number);
			phBookList.put(number, abon);
		}
	}

	public static void findNumbersM(Map<String, Abonent> phB, ArrayList<String> numb) {

		for (Iterator<Map.Entry<String, Abonent>> iter = phB.entrySet().iterator(); iter.hasNext();) {
			Map.Entry<String, Abonent> abM = iter.next();
			String currentPhNumber = abM.getKey();
			if (numb.contains(currentPhNumber)) {
				Abonent ab = abM.getValue();
				ab.AbonentPrint();
			}
		}

	}

	public static void printAllBookM(Map<String, Abonent> phB) {

		for (Iterator<Map.Entry<String, Abonent>> iter = phB.entrySet().iterator(); iter.hasNext();) {
			Abonent ab = new Abonent();
			Map.Entry<String, Abonent> abM = iter.next();
			ab = abM.getValue();
			ab.AbonentPrint();
		}

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
