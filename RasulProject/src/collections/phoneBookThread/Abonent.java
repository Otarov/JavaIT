package collections.phoneBookThread;

public class Abonent {

	public static int count;

	private String name;
	private String phoneNumber;
	private ServiceProvider sp;
	private boolean sot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public ServiceProvider getSp() {
		return sp;
	}

	public void setSp(ServiceProvider sp) {
		this.sp = sp;
	}

	public boolean isSot() {
		return sot;
	}

	public void setSot(boolean sot) {
		this.sot = sot;
	}

	public Abonent() {
		super();
		this.name = "Abonent";
		this.phoneNumber = "0000000000";
		this.sp = ServiceProvider.Мегафон;
		this.sot = true;
		count++;
	}
	
	public Abonent(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.sp = ServiceProvider.Мегафон;
		this.sot = true;
		count++;
	}

	public Abonent(String name, String phoneNumber, ServiceProvider sp) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.sp = sp;
		this.sot = true;
		count++;
	}
	
	public Abonent(String name, String phoneNumber, ServiceProvider sp, boolean sot) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.sp = sp;
		this.sot = sot;
		count++;
	}
	
	public void AbonentPrint(){
		System.out.println("--------------------");
		System.out.println("Абонент под номером " + count + ":");
		System.out.println(name + ":   " +  phoneNumber + "; " + sp);
		if (sot) System.out.println("сотовый");
		else System.out.println("городской");
		System.out.println("--------------------");
		
	}
}
