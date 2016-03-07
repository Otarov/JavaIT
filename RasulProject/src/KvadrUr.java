
public class KvadrUr {

	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		int c = Integer.parseInt(args[2]);
		
		System.out.println("”равнение " + a + "x^2 + " + b + "x + " + c + " = 0");
		if (a == 0) {
			System.out.println("Ёто не квадратное уравнение!");
			if (b == 0) {
				
				if (c == 0) System.out.println("”равнение имеет бесконечное множество решений"); //0*x^2 + 0*x +0 = 0
				else	System.out.println("Ќет решений");	//0*x^2 + 0*x + c = 0
			}
			else {  // b*x +c = 0
				double x = -c/b; 	
				System.out.println("”равнение имеет одно решение - " + x);
			}
		}
		else { // a не равно 0
			if (b == 0) {
				if (c == 0) { //a*x^2 = 0
					System.out.println("ƒва нулевых корн€");
				}
				else { //a*x^2 +c = 0
					if (c > 0) System.out.println("ƒействительных корней нет");
					else {
						double x = Math.sqrt(-c/a); 
						System.out.println("x1 = " + x + "; x2 = -" + x);
					}
				}
				}
			else {
				if (c == 0) { // a*x^2 + b*x  = 0
					double x1 = 0; 
					double x2 = -b / a;
					System.out.println("x1 = " + x1 + "; x2 = " + x2);
				}
				else { // нормальное квадратное уравнение
					double d = b*b-4*a*c;
					if (d < 0) System.out.print("ƒействительных корней нет"); 
					else 
						if (d == 0) {
							double x = -b / (2*a);
							System.out.println("ƒва одинаковых корн€, равные " + x);
						}
						else {
							double x1 = (-b - Math.sqrt(d))/(2*a);
							double x2 = (-b + Math.sqrt(d))/(2*a);
							System.out.println("x1 = " + x1 + "; x2 = " + x2);
						}
				}
			}
		}
		
	// надо указать количество знаков после зап€той вещественного числа при выводе

	}
	
	

}


