package vip.ikkyu.overrides.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author by xinming
 * @Classname LookupTest
 * @Description TODO
 * @Date 2021/6/6 14:32
 */
public class LookupTest {


	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("override.xml");
		AbstractFruitPlate fruit = (AbstractFruitPlate) applicationContext.getBean("abstractFruitPlate");
		fruit.getFruit().name();

	}
}
