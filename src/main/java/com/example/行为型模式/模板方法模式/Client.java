package com.example.行为型模式.模板方法模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/17 10:19 AM
 */
public class Client {
	public static void main(String[] args) {
		AbstractClass c1 = new ConcreteClassA();
		c1.templateMethod();
	}
}
