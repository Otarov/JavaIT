package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class ThreadMap implements Runnable {

	@Override
	public void run() {
		// карта
		Map<String, Abonent> phBookMap = new HashMap<>();

		System.out.println("«аполнение карты началось.");
		Date currentTime = new Date();
		addPhoneBookMap(phBookMap, PhoneBook.n);
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); // вычисление
																// разницы
		System.out.println("«аполнение карты завершилось через " + msDelay + " мс");

		// printAllBookM(phBookMap);

		System.out.println("=========================================");
		System.out.println("ѕоиск номеров в карте началс€.");
		currentTime = new Date();
		findNumbersM(phBookMap, PhoneBook.numbers);
		newTime = new Date();
		msDelay = newTime.getTime() - currentTime.getTime();
		System.out.println("ѕоиск номеров среди " + phBookMap.size() + " записей карты завершилс€ через " + msDelay + " мс");

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

}
