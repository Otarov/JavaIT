import java.io.*;

public class KvadrUr {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		int c = Integer.parseInt(args[2]);
		
		if (a == 0) {
			if (b == 0) {
				if (c == 0) System.out.println("Уравнение имеет бесконечное множество решений");
				else	System.out.println("Нет решений");
			}
			else {
				double x = -c/b; 
				System.out.println("Уравнение имеет одно решение - " + x);
			}
		else 
		}
		// TODO Auto-generated method stub

	}
	
	

}
