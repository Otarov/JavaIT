package HomeWork_2;

public class Ferma {
	
	public static void main(){
		Human ivan = new Human(); 	// ������� ���� ��������� �� ������ �������
		ivan.setName("Ivan");		// �������� ����� ������
		
		Cat vaska = new Cat();
		vaska.setName("Vaska");
		vaska.setColor("black");
		
		vaska.beOld(3);
		vaska.eat(ivan);
		vaska.move();
		vaska.voice();
		vaska.died();
		vaska.move();
		
	}
	
	
	
	

}
