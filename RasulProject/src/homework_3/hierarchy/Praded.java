package homework_3.hierarchy;

public class Praded {	// ����� ������
	
	private static  String surname;	// ������� ��������� ��� ���� ��������
	private String name;			// ��� � ���� ����
	private String address;			// ����� ����� ���� ������� � ����������� ��������
	private  String profession;		// ���������
	
	public  String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		Praded.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}	
	
	
	
	public Praded(String name, String address, String profession) {
		System.out.println("����������� �������");
		this.name = name;
		this.address = address;
		this.profession = profession;
	}

	
	
	
}
