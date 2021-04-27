package BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run_D {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope/context.xml");

		User user1 = context.getBean("MyUserConstructor", User.class);
		User user2 = context.getBean("MyUserConstructor", User.class);
		User user3 = context.getBean("MyUserConstructor", User.class);

		System.out.println(user1 == user2);

		System.out.println(user1);

		System.out.println(user2);

		System.out.println(user3);

	}

}
