package InitAndDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run_D {

	public static void main(String args[]) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("InitAndDestroy/context.xml");

		User user1 = context.getBean("MyUserConstructor", User.class);

		System.out.println(user1);

		context.close();

	}

}
