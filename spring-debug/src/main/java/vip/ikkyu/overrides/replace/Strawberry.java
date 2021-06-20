package vip.ikkyu.overrides.replace;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author xinming
 * @Description	replace-method
 */
public class Strawberry implements MethodReplacer {


    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("I am a fresh Strawberry");
        return obj;
    }
}