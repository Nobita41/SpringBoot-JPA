package com.lcwr.orm;

import com.lcwr.orm.Entities.User;
import com.lcwr.orm.services.UserServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner
{

	@Autowired
	private UserServices userServices;
	 Logger logger= LoggerFactory.getLogger(LearnSpringOrmApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user= new User();
//		user.setName("Raj");
//		user.setCity("lucknow");
//		user.setAge("19");
//		User saveusered = userServices.saveuser(user);
//		System.out.println(saveusered);


		//get alluser
//		List<User> allUser = userServices.getAllUser();
//		logger.info("user size is:{}", allUser.size());
//		logger.info("users: {}", allUser);

		// get single user
//		User User = userServices.getUser(1);
//		logger.info("user size is:{}", User);
//		logger.info("users: {}", User);


		// update user
//		User user= new User();
//		user.setName("Mohan");
//		user.setCity("kushinagar");
//		user.setAge("20");
//		User updateuser = userServices.updateuser(user, 1);
//		logger.info("user size is:{}", updateuser);


		//user delete
	 userServices.deleteUser(1);
	}
}
