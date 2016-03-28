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

		System.out.println("�������� ������ ���������� �������:");
		System.out.println("1 - ������ ����;");
		System.out.println("2 - ��������� �������;");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int way = Integer.parseInt(reader.readLine());

		System.out.println("----------------------------------");
		System.out.println("������� ��������� ����� � ������ ������? ");
		int k = Integer.parseInt(reader.readLine());

		if (way == 1) {

			System.out.println("������� �������� ������:");
			InputSet(list, k);
		} else if (way == 2) {
			InputSetWithRandom(list, k);

		} else
			System.out.println("������������ �����!!!");

		if (way != 1 && way != 2) {
			System.out.println("������ ���������!!!");
		} else {
			System.out.println("----------------------------------");
			System.out.println("�������������� ������:");
			printSet(list);

			removingUneven(list);
			System.out.println("----------------------------------");
			System.out.println("���������� ������:");
			printSet(list);

		}
	}

	public static void removingUneven(List<Integer> list) { // ��������
															// ���������,
															// ������� ��
															// �������� ��������
		for (int i = 0; i < list.size(); i++)
			list.remove(i);

	}

	public static void InputSet(List<Integer> set, int k) throws IOException { // ����
																				// ������
																				// �������
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < k; i++) {
			System.out.println("������� �����:");
			int element = Integer.parseInt(reader.readLine());
			set.add(element);

		}
	}

	public static void InputSetWithRandom(List<Integer> set, int k) throws IOException { // ���������
																							// ����������
																							// ������

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
