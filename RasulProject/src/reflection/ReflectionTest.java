package reflection;

import matrix.Matrix;
public class ReflectionTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Matrix matr = new Matrix(3,5);
		Class cl = matr.getClass();
		System.out.println(cl.getName());
		Object obj1 = cl.newInstance();
		Object obj2 = cl.newInstance();
		obj1.getClass();
		obj2.toString();
		
	

	}

}
