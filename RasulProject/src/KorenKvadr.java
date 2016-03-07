
public class KorenKvadr {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		
		boolean KorenNaiden = false;
		int x = 1;
		while (!(KorenNaiden) && (Kvadr(x) <= a)){
			if (Kvadr(x) == a) {
				KorenNaiden = true;
				System.out.println(" орень квадратный числа " + a + " равен " + x);
			}
			else x++;
		}
		
		if (!KorenNaiden) System.out.println("÷елочисленный корень квадратный числа " + a + " не найден" + x);
		// TODO Auto-generated method stub

	}
public static int Kvadr(int x){
	int kv = 0;
	for (int i=1; i <= x; i++){
		kv += i;
	}
	return kv;
	
}
}
