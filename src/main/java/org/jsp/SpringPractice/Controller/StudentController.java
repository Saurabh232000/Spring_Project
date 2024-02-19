package org.jsp.SpringPractice.Controller;

import org.jsp.SpringPractice.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		Student bean = context.getBean(Student.class);
		System.out.println(bean);
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getPhone());
		System.out.println(bean.getAddress());
	}
}
