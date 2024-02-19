package WithoutCreatingBean;

import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("WithoutBean.xml");
	Employee employee = context.getBean(Employee.class);
	System.out.println(employee.getId());
	System.out.println(employee.getName());
	System.out.println(employee.getPhones());
	System.out.println(employee.getClass().getName());
}
}
