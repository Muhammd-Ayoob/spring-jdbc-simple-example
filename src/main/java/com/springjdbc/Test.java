package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
		
		String query="insert into student(student_name, city) values('Ayoob','Bandhi')";
		
		template.update(query);
		
		System.out.println("Congrats Running successfully. . . ");
	}
}
