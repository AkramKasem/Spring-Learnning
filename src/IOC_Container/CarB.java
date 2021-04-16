package IOC_Container;

public class CarB implements Car{

	@Override
	public void display() {
		System.out.println("This is Car B");
	}

	@Override
	public void Price() {
		System.out.println("10000 $");
	}

}