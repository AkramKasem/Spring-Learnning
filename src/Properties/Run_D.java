package Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run_D {

	public static void main(String args[]) {
		System.out.println("AK");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Properties/context.xml");

		User user = context.getBean("MyUserConstructor", User.class);
		System.out.println(user.toString());

	}

}
