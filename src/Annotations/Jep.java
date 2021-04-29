package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Jep {

	int x = 5;

	@Autowired
	public Jep() {
		super();
		System.out.println(5);
		System.out.println(x);
		System.out.println("Akram");
		MyCar();
	}

//	public int getX() {
//		return x;
//	}
//
//
//
//
//	public void setX(int x) {
//		this.x = x;
//	}

	public void MyCar() {
		System.out.println("This My Car");

	}

}
