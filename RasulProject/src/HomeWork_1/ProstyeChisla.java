package HomeWork_1;

public class ProstyeChisla {

	public static void main(String[] args) {
		System.out.println("��� ������� ����� �� 0 �� 1000");
		
		for (int i = 1; i <= 1000; i++){ 	// ������� ���� ����� �� 1 �� 1000
			
			//System.out.println("�������� ����� " + i);
			
			boolean prostoe = true;			
			int j = 2;
			//System.out.println(prostoe);
			while ((prostoe) && (j < i/2+1 )) {
				
				if (i % j == 0) prostoe = false;
				else j++;// 
			}
			//System.out.println(prostoe);
			if (prostoe) System.out.println(i);
		}

	}

}
