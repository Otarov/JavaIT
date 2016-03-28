package collections.listArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListArray {

	public static void main(String[] args) throws IOException {

		List<Integer> list = new ArrayList<Integer>();

		System.out.println("Выберите способ заполнения списков:");
		System.out.println("1 - ручной ввод;");
		System.out.println("2 - случайным образом;");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int way = Integer.parseInt(reader.readLine());

		System.out.println("----------------------------------");
		System.out.println("Сколько элементов будет в данном списке? ");
		int k = Integer.parseInt(reader.readLine());

		if (way == 1) {

			System.out.println("Введите значения списка:");
			InputSet(list, k);
		} else if (way == 2) {
			InputSetWithRandom(list, k);

		} else
			System.out.println("Некорректный выбор!!!");

		if (way != 1 && way != 2) {
			System.out.println("Пустые множества!!!");
		} else {
			System.out.println("----------------------------------");
			System.out.println("Первоначальный список:");
			printSet(list);

			removingUneven(list);
			System.out.println("----------------------------------");
			System.out.println("Полученный список:");
			printSet(list);

		}
	}

	public static void removingUneven(List<Integer> list) { // удаление
															// элементов,
															// стоящих на
															// нечетных позициях
		for (int i = 0; i < list.size(); i++)
			list.remove(i);

	}

	public static void InputSet(List<Integer> set, int k) throws IOException { // ввод
																				// списка
																				// вручную
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < k; i++) {
			System.out.println("Введите число:");
			int element = Integer.parseInt(reader.readLine());
			set.add(element);

		}
	}

	public static void InputSetWithRandom(List<Integer> set, int k) throws IOException { // случайное
																							// заполнение
																							// списка

		Random r = new Random();
		for (int i = 0; i < k; i++) {
			int element = r.nextInt(1000);
			set.add(element);

		}
	}

	public static void printSet(List<Integer> set) {
		for (Iterator<Integer> iter = set.iterator(); iter.hasNext();) {

			System.out.println(iter.next().intValue());

		}

	}

}
