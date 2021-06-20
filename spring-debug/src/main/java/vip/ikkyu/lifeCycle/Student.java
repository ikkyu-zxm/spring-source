package vip.ikkyu.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author by xinming
 * @Classname Student
 * @Description TODO
 * @Date 2021/6/5 16:36
 */
public class Student implements ApplicationContextAware {


	private int age;

	private String name;

	public void init() {
		System.out.println("执行 init-method");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("属性赋值");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("执行 ApplicationContextAware ");
	}

	@Override
	public String toString() {
		return "Student{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}
