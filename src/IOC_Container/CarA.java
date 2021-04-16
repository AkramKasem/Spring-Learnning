package IOC_Container;

public class CarA implements Car{

	@Override
	public void display() {
		System.out.println("This is Car A");
	}

	@Override
	public void Price() {
		System.out.println("50000 $");
	}

}
