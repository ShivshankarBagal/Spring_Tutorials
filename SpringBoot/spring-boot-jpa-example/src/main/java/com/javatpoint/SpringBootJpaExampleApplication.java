package com.javatpoint;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.javatpoint.dao.UserRepository;
import com.javatpoint.model.User;

@SpringBootApplication
public class SpringBootJpaExampleApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaExampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//User user=new User();
//user.setUsername("Asmita");
//user.setCity("Mumbai");
//
//User save = userRepository.save(user);
//System.out.println(save);

		User user1 = new User();
		user1.setUsername("Akash");
		user1.setCity("pune");

		User user2 = new User();
		user2.setUsername("Rani");
		user2.setCity("Mumbai");
		
		User resultUser1 = userRepository.save(user1);
		System.out.println(resultUser1);

	}
}
