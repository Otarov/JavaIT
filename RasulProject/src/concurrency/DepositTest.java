package concurrency;

import java.util.concurrent.locks.Lock;

public class DepositTest {

	public static void main(String[] args) throws InterruptedException {
		Deposit clientDeposit = new Deposit("4284541242456654");
		clientDeposit.setRestSum(10000);

		for (int i = 0; i < 6; i++) {
			Thread salaryThread = new Thread(new Salary(clientDeposit));
			Thread spenderThread = new Thread(new Spender(clientDeposit, 3000));
			// Thread viewThread = new Thread(new ViewActualData(clientDeposit,
			// lock));
			salaryThread.start();
//			salaryThread.join();
			
			spenderThread.start();
//			spenderThread.join();
			
			
//			clientDeposit.printArrList();
			// viewThread.start();
		}

		while (clientDeposit.restSum.size() < 13){
//			
			System.out.println("Waiting!");
			
		}
		clientDeposit.totalSumma(clientDeposit.getRestSum());
//		clientDeposit.printArrList();
	}

	static class Salary implements Runnable {

		private Deposit deposit;

		public static final int AMOUNT = 30000;

		public Salary(Deposit dep) {
			this.deposit = dep;

		}

		@Override
		public void run() {

			
			deposit.modifyRest(AMOUNT);

		}
	}

	static class Spender implements Runnable {

		private Deposit deposit;
		private int summa;

		public Spender(Deposit dep, int summa) {
			this.deposit = dep;
			this.summa = summa;

		}

		@Override
		public void run() {
			// synchronized (deposit) {
			// }

			
			deposit.modifyRest(-1 * summa);

		}
	}

	static class ViewActualData implements Runnable {

		Deposit dep;
		private Lock lock;

		public ViewActualData(Deposit clientDeposit, Lock lock) {
			this.dep = clientDeposit;
			this.lock = lock;
		}

		@Override
		public void run() {
			// try {
			// while (lock.tryLock()){
			// System.out.println(this.dep.getRestSum());
			// }
			// }
			// finally {
			// lock.unlock();
			// }

			// if (lock.tryLock()) {
			System.out.println(this.dep.getRestSum());
			// lock.unlock();
			// }
		}

	}
}
