package HomeWork_2;

public abstract class Pet { 	// ќбщий класс домашних животных, у любого из которых есть:

	private String owner;				// владелец,
	private int age;					// возраст.
	private boolean alive;				// —осто€ние: жив (true) или нет (false)
 	
	
	public String getOwner() {				// метод, позвол€ющий вызвать владельца
		return owner;
	}
	public void setOwner(String owner) {	// метод, который может записать владельца
		this.owner = owner;
	}
	public int getAge() {					// аналогичные действи€ со значением возраста
		return age;
	}
	public void setAge(int age) {
		if (age >= 0)	this.age = age;
		else System.out.println("¬озраст не может быть отрицательным!"); 
	}
	
	public boolean getAlive() {				// и его жизнеспособности
		return alive;
	}
	public void setAlive(boolean alive) {  // ???
		this.alive = alive;
	}
	
	public abstract void move();	// пустой абстрактный метод перемещатьс€, а каким обазом,
									// пока не известно.
	
									
	
	public abstract void voice();	// пустой абстрактный метод издавать звуки, а какие именно,
									// и даже какого рода эти звуки, пока не известно.
	
	public int beOld(int age){				// —тарение на год, если он жив пока
		if (alive) age++;
		return age;
	}
	
	public int beOld(int age, int k){		// —тарение на k лет, если пока жив
		if (alive) age +=k;
		return age;
	}
	
	public void died(){		// —мерть
		if (alive) alive = false;
		else System.out.println("∆ивотное не может второй раз умереть!");
	}
	
	
	
	public void eat(Human man){				// “.к. это дом. жив. кушать оно может только 
		System.out.println("ћен€ покормил " + man);		// с помощью человека (параметром €вл€етс€ объект типа человек)
	}
}

