import java.io.*;

public class KvadrUr {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		int c = Integer.parseInt(args[2]);
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0) System.out.println("��������� ����� ����������� ��������� �������");
				else	System.out.println("��� �������");
			}
			else {
				double x = -c/b; 
				System.out.println("��������� ����� ���� ������� - " + x);
			}
		else 
		}
		// TODO Auto-generated method stub

	}
	
	

}
