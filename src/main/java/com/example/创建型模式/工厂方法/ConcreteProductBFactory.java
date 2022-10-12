package com.example.创建型模式.工厂方法;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/12 2:21 PM
 */
public class ConcreteProductBFactory implements Factory{
	@Override
	public Product createProduct() {
		return new ConcreteProductB();
	}
}
