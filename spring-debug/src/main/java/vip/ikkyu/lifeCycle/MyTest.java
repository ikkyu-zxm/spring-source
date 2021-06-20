package vip.ikkyu.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author by xinming
 * @Classname MyTest
 * @Description TODO
 * @Date 2021/6/5 16:41
 */
public class MyTest {


	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCycle.xml");
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);
	}
}
