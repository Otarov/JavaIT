package HomeWork_2;

public class Cat extends Pet {

	private String name;	// кличка
	private String color;	// цвет
	
	
	
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
		if (alive) System.out.println("ходит ногами");// расширенный метод перемещени€ - ходить
		else System.out.println("ќн больше не пойдет никуда! ((");
	}

	@Override
	public void voice() {
		System.out.println("ћ€у!");// TODO Auto-generated method stub
		
	}		// класс кошек

}
