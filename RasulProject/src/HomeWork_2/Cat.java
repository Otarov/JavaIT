package HomeWork_2;

public class Cat extends Pet {

	private String name;	// ������
	private String color;	// ����
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		if (alive) System.out.println("����� ������");// ����������� ����� ����������� - ������
		else System.out.println("�� ������ �� ������ ������! ((");
	}

	@Override
	public void voice() {
		System.out.println("���!");// TODO Auto-generated method stub
		
	}		// ����� �����

}
