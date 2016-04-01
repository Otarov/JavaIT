package collections;

public enum ServiceProvider {
	
	Мегафон(1), Билайн(2), МТС(3), Теле2(4);
	
	int spIndex;
	ServiceProvider(int index){
		this.spIndex = index;
	}

}
