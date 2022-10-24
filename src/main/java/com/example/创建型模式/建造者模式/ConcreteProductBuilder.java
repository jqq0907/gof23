package com.example.创建型模式.建造者模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/13 2:09 PM
 */
public class ConcreteProductBuilder extends Builder{
	private Product product = new Product();
	@Override
	public void setPart() {
		product.setName("产品1");
	}

	@Override
	public Product buildProduct() {
		return product;
	}
}
