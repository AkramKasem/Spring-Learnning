package IOC_Container;

public class CarC  implements Car{

	@Override
	public void display() {
		System.out.println("This is Car C");
	}

	@Override
	public void Price() {
		System.out.println("40000 $");
	}
}
