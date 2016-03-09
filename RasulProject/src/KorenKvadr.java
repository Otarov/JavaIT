
public class KorenKvadr {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		
		boolean KorenNaiden = false;
		int x = 1;
		while (!(KorenNaiden) && (Kvadr(x) <= a)){
			
			System.out.println("x = " + x + " Kvadr = " + Kvadr(x));
		
			
			if (Kvadr(x) == a) {
				KorenNaiden = true;
			}
			else x++;
		}
		
		if (!KorenNaiden) System.out.println("÷елочисленный корень квадратный числа " + a + " не найден");
		// TODO Auto-generated method stub

	}
public static int Kvadr(int x){ // Ќахождение квадрата числа х 
	int kv = 0;
	for (int i=1; i <= x; i++){
		kv += x;
	}
	return kv;
	
}

}
