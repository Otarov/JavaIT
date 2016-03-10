package HomeWork_2;

public abstract class Pet { 	// ����� ����� �������� ��������, � ������ �� ������� ����:

	String owner;				// ��������,
	int age;					// �������.
	boolean alive;				// ��������� ����� ��� (true) ��� ��� (false)
 	
	
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
		this.age = age;
	}
	
	public boolean isAlive() {				// � ��� ����������������
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public abstract void move();	// ������ ����������� ����� ������������, � ����� ������,
									// ���� �� ��������.
	
	public abstract void voice();	// ������ ����������� ����� �������� �����, � ����� ������,
									// � ���� ������ ���� ��� �����, ���� �� ��������.
	
	public int beOld(int age){				// �������� �� ���
		return ++age;
	}
	
	public int beOld(int age, int k){		// �������� �� k ���
		age +=k;
		return age;
	}
	
}

