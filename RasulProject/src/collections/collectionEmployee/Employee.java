package collections.collectionEmployee;

public class Employee {
	
	private String name;					// ���
	
	private int workAge;			// ���� ������
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWorkAge() {
		return workAge;
	}
	public void setLengthOfService(int workAge) {
		if (workAge < 0) System.out.println("������������ ����!");
		else	this.workAge = workAge;
	}
	public Employee(String name, int workAge) {
		super();
		this.name = name;
		if (workAge < 0) System.out.println("������������ ����!");
		else	this.workAge = workAge;
	}
	
	

	
	
}
