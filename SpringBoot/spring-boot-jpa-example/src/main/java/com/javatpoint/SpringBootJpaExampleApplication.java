package com.javatpoint;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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

//		User user1 = new User();
//		user1.setUsername("Vaishnavi");
//		user1.setCity("Nashik");
//
//		User user2 = new User();
//		user2.setUsername("Rani");
//		user2.setCity("Mumbai");

//		User resultUser1 = userRepository.save(user1);
//		System.out.println(resultUser1);

//		//same multiple objects
//		List<User> list = List.of(user1,user2);
//		Iterable<User> finalResult = userRepository.saveAll(list);
//		
//		finalResult.forEach(a ->{
//			System.out.println(a);
//		});

		// update

//		Optional<User> optional = userRepository.findById(2);
//		
//		User user = optional.get();
//		
//		user.setCity("Nagpur");
//		User save = userRepository.save(user);
//		System.out.println(save);

		// get the data
//		Optional<User> optional = userRepository.findById(3);
//		System.out.println(optional);

		// get all data
		Iterable<User> itr = userRepository.findAll();

		itr.forEach(user -> {
			System.out.println(user);
		});
		
		//delete
		userRepository.deleteById(4);

	}
}
