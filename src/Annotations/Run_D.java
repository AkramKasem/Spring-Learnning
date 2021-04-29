package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run_D {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Annotations/context.xml");

		Jep car = context.getBean("jep", Jep.class);
		car.MyCar();

		context.close();

	}

}
