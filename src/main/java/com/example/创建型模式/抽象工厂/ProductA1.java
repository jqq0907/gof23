package com.example.创建型模式.抽象工厂;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/12 2:34 PM
 */
public class ProductA1 extends AbstractProductA{
	public ProductA1() {
		super();
		this.name = "产品A1";
	}
	@Override
	public void doSomething() {
		System.out.println(this.name + "doSomething");
	}
}
