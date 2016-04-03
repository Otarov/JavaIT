package matrix;

public class Matrix {			// общий класс двумерных целочисленных массивов (матриц)

								// размерность
	private int n;				// кол-во строк
	private int m;				// кол-во столбцов
	
	private int[][] array;		// сама матрица
	
	
	public int getN() {			// геттеры - сеттеры...
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int[][] getArray() {
		return array;
	}

	public void setArray(int[][] array) {
		this.array = array;
	}

	
	

	public Matrix(int n, int m, int[][] array) {	// конструктор, иниц-щий матрицу со всеми параметрами
		super();
		this.n = n;
		this.m = m;
		this.array = array;
	}
	
	public Matrix(int n, int m) {		// матрица по умолчанию n х m и с элементами, равными сумме индексов
		super();
		this.n = n;
		this.m = m;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				arr[i][j] = i + j;
		setArray(arr);
	}
	
	public Matrix() {		// матрица по умолчанию 3 х 3 и с элементами, равными сумме индексов
		super();			// не понял, что это делает
		this.n = 3;
		this.m = 3;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				this.array[i][j] = i + j;		
			
	}
	
	public void matrixPrint() {		// так наша матрица выводится на экран
		System.out.println("Двумерный массив размером " + n + " x " + m + ":");
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public Matrix matrixSumm(Matrix arr1) {		// сумма двух матриц одинаковой размерности
		Matrix summ = new Matrix();
			System.out.println("Сумма двух матриц " + arr1.n + " x " + arr1.m + ":");
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				summ.array[i][j] = arr1.array[i][j] + array[i][j];
		return summ;	
		}
	
	public Matrix matrixRazn(Matrix arr1) {		// разность двух матриц одинаковой размерности
		Matrix summ = new Matrix();
			System.out.println("Разность двух матриц " + arr1.n + " x " + arr1.m + ":");
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				summ.array[i][j] = arr1.array[i][j] - array[i][j];
		return summ;	
		}
	
	
}
