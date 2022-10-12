package com.example.创建型模式.抽象工厂;

/**
 * @author jiangqiangqiang
 * @description: 创建1系列产品
 * @date 2022/10/12 2:48 PM
 */
public class ConcreteFactory1 implements AbstractFactory{

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
