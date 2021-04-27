package Dependency_Injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run_D {

	public static void main(String args[]) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Dependency_Injection/context.xml");

		User user = context.getBean("MyUserConstructor", User.class);
		System.out.println(user.toString());

	}

}
