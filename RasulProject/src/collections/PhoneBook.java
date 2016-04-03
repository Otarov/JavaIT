package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PhoneBook {

	static ArrayList<String> numbers = new ArrayList<>();
	static int n = 1000000;   // количество элементов
	public static void main(String[] args) { 
		addNumbers(numbers);
		
		ThreadSet thS = new ThreadSet();
		ThreadMap thM = new ThreadMap();
		ThreadArr thA = new ThreadArr();
		thS.run();
		thM.run();
		thA.run();

		
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

	



}
