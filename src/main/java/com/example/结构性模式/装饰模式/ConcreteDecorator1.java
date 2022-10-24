package com.example.结构性模式.装饰模式;

/**
 * @author jiangqiangqiang
 * @description: 具体修饰着
 * @date 2022/10/21 5:43 PM
 */
public class ConcreteDecorator1 extends Decorator{
	public ConcreteDecorator1(Component component) {
		super(component);
	}

	private void method1() {
		System.out.println("method1修饰");
	}

	@Override
	public void operate() {
		this.method1();
		super.operate();
	}
}
