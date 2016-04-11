package concurrency;

import java.util.ArrayList;

public class Deposit {

	String accountNumber;
	ArrayList<Integer> restSum = new ArrayList<Integer>();
	
	public Deposit(String number){
		this.accountNumber = number;
		this.restSum.add(0);
	}
	
	public ArrayList<Integer> getRestSum() {
		return restSum;
	}
	public void setRestSum(int value) {
		this.restSum.set(0, value);
	}
	
	public void modifyRest(int value){
//		this.restSum.set(this.restSum.addAndGet(value));
		
//		printArrList();
		restSum.add(value);
		System.out.println("Добавлено изменение номер " + (restSum.size() - 1) + " :");
		printArrList();
	}
	
	public void totalSumma(ArrayList<Integer> restS){
		System.out.println("Подведение итогов изменений над счетом");
		System.out.println("Начальный список");
		printArrList();
		int res = 0;
		for (int i: restS){
			res += i;
		}
		restS.clear();
		restS.add(res);
		System.out.println("Итоговый список");
		printArrList();
		
		
	}
	
	public void printArrList(){
		System.out.println("*********************");
		for (int i: restSum){
			System.out.print(i + " ");
		}
		System.out.println("---------------------");
		
	}
}
