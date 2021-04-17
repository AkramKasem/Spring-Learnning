package IOC_Container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("IOC_Container/contextIOC.xml");
		
		Car c = context.getBean("MyCarA",Car.class);
		c.display();
		c.Price();
		
		Car c1 = context.getBean("MyCarB",Car.class);
		c1.display();
		c1.Price();
		
		Car c2 = context.getBean("MyCarC",Car.class);
		c2.display();
		c2.Price();
		
		context.close();

	}

}
