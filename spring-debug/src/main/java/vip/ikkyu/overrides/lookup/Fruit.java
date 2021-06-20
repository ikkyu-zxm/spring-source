package vip.ikkyu.overrides.lookup;

/**
 * @author by xinming
 * @Classname Fruit
 * @Description lookup-method test
 * @Date 2021/6/6 14:29
 */
public class Fruit {

	public void name() {
		System.out.println("I am a Fruit");
	}
}


class Apple extends Fruit {

	@Override
	public void name() {
		System.out.println("I am a fresh apple");
	}
}

class Banana extends Fruit {

	@Override
	public void name() {
		System.out.println("I am a fresh banana");
	}
}
