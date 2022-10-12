package com.example.创建型模式.抽象工厂;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/12 2:34 PM
 */
public class ProductB1 extends AbstractProductB{
	public ProductB1() {
		super();
		this.name = "产品B1";
	}
	@Override
	public void doSomething() {
		System.out.println(this.name + "doSomething");
	}
}
