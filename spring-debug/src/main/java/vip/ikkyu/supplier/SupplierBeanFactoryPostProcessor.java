package vip.ikkyu.supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition user = beanFactory.getBeanDefinition("user");
        GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) user;
        genericBeanDefinition.setInstanceSupplier(() -> {
			User entity = new User();
			entity.setUsername("葬爱少年--王五");
			return entity;
		});
        genericBeanDefinition.setBeanClass(User.class);
    }
}
