package matrix;

public class Matrix {			// ����� ����� ��������� ������������� �������� (������)

								// �����������
	private int n;				// ���-�� �����
	private int m;				// ���-�� ��������
	
	private int[][] array;		// ���� �������
	
	
	public int getN() {			// ������� - �������...
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

	
	

	public Matrix(int n, int m, int[][] array) {	// �����������, ����-��� ������� �� ����� �����������
		super();
		this.n = n;
		this.m = m;
		this.array = array;
	}
	
	public Matrix(int n, int m) {		// ������� �� ��������� n � m � � ����������, ������� ����� ��������
		super();
		this.n = n;
		this.m = m;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				arr[i][j] = i + j;
		setArray(arr);
	}
	
	public Matrix() {		// ������� �� ��������� 3 � 3 � � ����������, ������� ����� ��������
		super();			// �� �����, ��� ��� ������
		this.n = 3;
		this.m = 3;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				this.array[i][j] = i + j;		
			
	}
	
	public void matrixPrint() {		// ��� ���� ������� ��������� �� �����
		System.out.println("��������� ������ �������� " + n + " x " + m + ":");
		for (int i = 0; i < n; i++){
			for (int j = 0; j < m; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public Matrix matrixSumm(Matrix arr1) {		// ����� ���� ������ ���������� �����������
		Matrix summ = new Matrix();
			System.out.println("����� ���� ������ " + arr1.n + " x " + arr1.m + ":");
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				summ.array[i][j] = arr1.array[i][j] + array[i][j];
		return summ;	
		}
	
	public Matrix matrixRazn(Matrix arr1) {		// �������� ���� ������ ���������� �����������
		Matrix summ = new Matrix();
			System.out.println("�������� ���� ������ " + arr1.n + " x " + arr1.m + ":");
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				summ.array[i][j] = arr1.array[i][j] - array[i][j];
		return summ;	
		}
	
	
}
