package matrix;

public class MatrixTest {

	
	
	public static void main(String[] args) {
	
		int[][] arr = new int[3][5];
		arr[0][0] = 1;
		arr[0][1] = 3;
		arr[0][2] = 5;
		arr[0][3] = 6;
		arr[0][4] = 8;
		arr[1][0] = 4;
		arr[1][1] = -3;
		arr[1][2] = 0;
		arr[1][3] = 11;
		arr[1][4] = 3;
		arr[2][0] = 4;
		arr[2][1] = 2;
		arr[2][2] = 8;
		arr[2][3] = 44;
		arr[2][4] = 8;
		

		Matrix array1 = new Matrix(3, 5, arr);
		
		Matrix array2 =new Matrix(3,5);
		
		System.out.println("Первая матрица, созданная вручную");
	
		array1.matrixPrint();
		
		System.out.println("Вторая матрица, созданная по умолчанию при вводе только размерности");
		
		array2.matrixPrint();
		Matrix arraySumm = new Matrix();
		arraySumm = array1.matrixSumm(array2);
		System.out.println("Сумма двух матриц:");
		arraySumm.matrixPrint();
		
		
		// TODO Auto-generated method stub
		}
	}


