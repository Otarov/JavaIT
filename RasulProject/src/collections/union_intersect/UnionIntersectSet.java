package collections.union_intersect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class UnionIntersectSet {

	public static void main(String[] args) throws IOException {

		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		System.out.println("Выберите способ заполнения множеств:");
		System.out.println("1 - ручной ввод;");
		System.out.println("2 - случайным образом;");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int way = Integer.parseInt(reader.readLine());

		System.out.println("----------------------------------");
		System.out.println("Сколько элементов у первого множества? ");
		int k1 = Integer.parseInt(reader.readLine());

		System.out.println("----------------------------------");
		System.out.println("Сколько элементов у второго множества? ");
		int k2 = Integer.parseInt(reader.readLine());

		if (way == 1) {

			System.out.println("Введите первое множество:");
			InputSet(set1, k1);

			System.out.println("Введите второе множество:");
			InputSet(set2, k2);
		} else if (way == 2) {
			InputSetWithRandom(set1, k1);
			InputSetWithRandom(set2, k2);
		} else
			System.out.println("Некорректный выбор!!!");

		if (way != 1 && way != 2) {
			System.out.println("Пустые множества!!!");
		} else {
			System.out.println("----------------------------------");
			System.out.println("Первое множество:");
			printSet(set1);
			System.out.println("----------------------------------");
			System.out.println("Второе множество:");
			printSet(set2);
			System.out.println("----------------------------------");
			System.out.println("Объединение множеств:");
			printSet(union(set1, set2));
			System.out.println("----------------------------------");
			System.out.println("Пересечение множеств:");
			printSet(intersect(set1, set2));

		}
	}

	public static void InputSet(Set<Integer> set, int k) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < k; i++) {
			System.out.println("Введите число:");
			int element = Integer.parseInt(reader.readLine());
			set.add(element);

		}
	}

	public static void InputSetWithRandom(Set<Integer> set, int k) throws IOException {

		Random r = new Random();
		for (int i = 0; i < k; i++) {
			int element = r.nextInt(1000);
			set.add(element);

		}
	}

	public static void printSet(Set<Integer> set) {
		for (Iterator<Integer> iter = set.iterator(); iter.hasNext();) {

			System.out.println(iter.next().intValue());

		}
	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<>();
		result.addAll(set1);
		result.addAll(set2);
		return result;
	}

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<>();
		for (int i : set1) {
			if (set2.contains(i))
				result.add(i);
		}

		return result;

	}

}
