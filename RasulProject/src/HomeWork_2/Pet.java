package HomeWork_2;

public abstract class Pet { 	// ����� ����� �������� ��������, � ������ �� ������� ����:

	private String owner;				// ��������,
	private int age;					// �������.
	private boolean alive;				// ���������: ��� (true) ��� ��� (false)
 	
	
	public String getOwner() {				// �����, ����������� ������� ���������
		return owner;
	}
	public void setOwner(String owner) {	// �����, ������� ����� �������� ���������
		this.owner = owner;
	}
	public int getAge() {					// ����������� �������� �� ��������� ��������
		return age;
	}
	public void setAge(int age) {
		if (age >= 0)	this.age = age;
		else System.out.println("������� �� ����� ���� �������������!"); 
	}
	
	public boolean getAlive() {				// � ��� ����������������
		return alive;
	}
	public void setAlive(boolean alive) {  // ???
		this.alive = alive;
	}
	
	public abstract void move();	// ������ ����������� ����� ������������, � ����� ������,
									// ���� �� ��������.
	
									
	
	public abstract void voice();	// ������ ����������� ����� �������� �����, � ����� ������,
									// � ���� ������ ���� ��� �����, ���� �� ��������.
	
	public int beOld(int age){				// �������� �� ���, ���� �� ��� ����
		if (alive) age++;
		return age;
	}
	
	public int beOld(int age, int k){		// �������� �� k ���, ���� ���� ���
		if (alive) age +=k;
		return age;
	}
	
	public void died(){		// ������
		if (alive) alive = false;
		else System.out.println("�������� �� ����� ������ ��� �������!");
	}
	
	
	
	public void eat(Human man){				// �.�. ��� ���. ���. ������ ��� ����� ������ 
		System.out.println("���� �������� " + man);		// � ������� �������� (���������� �������� ������ ���� �������)
	}
}

