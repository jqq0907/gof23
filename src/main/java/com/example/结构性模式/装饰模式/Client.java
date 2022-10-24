package com.example.结构性模式.装饰模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/21 5:45 PM
 */
public class Client {
	public static void main(String[] args) {
		Component component = new ConcreteConponent();
		// 第一次修饰
		component = new ConcreteDecorator1(component);
		// 第二次修饰
		component = new ConcreteDecorator2(component);
		component.operate();
	}
}
