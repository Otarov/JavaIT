package HomeWork_2;

public abstract class Pet { 	// Общий класс домашних животных, у любого из которых есть:

	private String owner;				// владелец,
	private int age;					// возраст.
	private boolean alive;				// Состояние: жив (true) или нет (false)
 	
	
	public String getOwner() {				// метод, позволяющий вызвать владельца
		return owner;
	}
	public void setOwner(String owner) {	// метод, который может записать владельца
		this.owner = owner;
	}
	public int getAge() {					// аналогичные действия со значением возраста
		return age;
	}
	public void setAge(int age) {
		if (age >= 0)	this.age = age;
		else System.out.println("Возраст не может быть отрицательным!"); 
	}
	
	public boolean isAlive() {				// и его жизнеспособности
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public abstract void move();	// пустой абстрактный метод перемещаться, а каким обазом,
									// пока не известно.
	
	public abstract void voice();	// пустой абстрактный метод издавать звуки, а какие именно,
									// и даже какого рода эти звуки, пока не известно.
	
	public int beOld(int age){				// Старение на год, если он жив пока
		if (alive) age++;
		return age;
	}
	
	public int beOld(int age, int k){		// Старение на k лет, если пока жив
		if (alive) age +=k;
		return age;
	}
	
}

