package Desktop;

public class Krug extends Figura {

	public int r;	//радиус
	
	
public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


@Override
	public double Square() {
		double s = 3.14*r*r;
		// TODO Auto-generated method stub
		return s;
	}
}
