package com.edu.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		//default run statement: SpringApplication.run(LearnApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(LearnApplication.class, args);

		Alien a = context.getBean(Alien.class);
		/*
		This will create one object even if you made another object like a2.
		In code applications (unlike web applications), the object/bean will be created
		within two scopes: singleton and prototype. Where singleton is on by default, and prototype makes it possible
		to create a bean whenever we call a new object.
		 */
		a.show();

		Alien a2 = context.getBean(Alien.class);
		a2.show(); //which will give the same object with the same hash as the one above...

		a.kill();
		/*
		Adding @Component in the Weapon class is not enough for a from the Alien class to find
		the method in Weapon class. That's why we need to use @Autowire, so that the Spring container
		will search for the name. In this case, it is the variable weapon of type Weapon in the Alien class.

		It's also possible to change the reference name by specifying @Component("anotherName").
		Or by using @Qualifier("aName") above the variable.
		 */

	}

}
