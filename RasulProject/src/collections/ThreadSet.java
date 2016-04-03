package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ThreadSet implements Runnable {
	
	@Override
	public void run() {

		// множество
		Set<Abonent> phBookSet = new HashSet<>();

		System.out.println("Заполнение множества началось.");
		Date currentTime = new Date();
		addPhoneBookSet(phBookSet, PhoneBook.n);
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // вычисление
																// разницы
		System.out.println("Заполнение множества завершилось через " + msDelay + " мс");

		// printAllBook(phBookList);
		System.out.println("=========================================");

		System.out.println("Поиск номеров в множестве начался.");
		currentTime = new Date();
		findNumbersS(phBookSet, PhoneBook.numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("Поиск номеров среди " + phBookSet.size() + " записей множества завершился через " + msDelay + " мс");

		System.out.println("********************************");
		// TODO Auto-generated method stub

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

	

}
