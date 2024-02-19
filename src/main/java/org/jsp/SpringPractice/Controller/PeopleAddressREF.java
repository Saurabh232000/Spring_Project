package org.jsp.SpringPractice.Controller;

import org.jboss.jandex.Main;
import org.jsp.SpringPractice.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PeopleAddressREF {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("peopleAddress.xml");
	People bean = context.getBean(People.class);
	System.out.println(bean);
	System.out.println(bean.getId());
	System.out.println(bean.getName());
	System.out.println(bean.getAddress().getId());
	System.out.println(bean.getAddress().getAddressname());
}
}
