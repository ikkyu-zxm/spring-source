package vip.ikkyu.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author by xinming
 * @Classname MyBeanFactoryPostProcessor
 * @Description TODO
 * @Date 2021/6/5 16:31
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("执行 --- myBeanFactoryPostprocessor --------- ");
	}
}
