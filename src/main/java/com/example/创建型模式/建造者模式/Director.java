package com.example.创建型模式.建造者模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/13 2:10 PM
 */
public class Director {
	private Builder builder = new ConcreteProductBuilder();
	public Product getProduct() {
		builder.setPart();
		return builder.buildProduct();
	}
}
