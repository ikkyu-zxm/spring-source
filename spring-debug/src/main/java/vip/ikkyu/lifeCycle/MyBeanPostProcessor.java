package vip.ikkyu.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author by xinming
 * @Classname MyBeanPostProcessor
 * @Description TODO
 * @Date 2021/6/5 16:33
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行 beanPostProcessor  before");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("执行 beanPostProcessor  after");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
