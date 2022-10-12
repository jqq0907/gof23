package com.example.创建型模式.简单工厂;

/**
 * @author jiangqiangqiang
 * @description: 简单工厂
 * @date 2022/10/12 1:34 PM
 */
public class SimpleFactory {
	private SimpleFactory() {}

	public static Product getProduct(String productName) {
		switch (productName) {
			case "A":
				return new ProductA();
			case "B":
				return new ProductB();
			default:
				return null;
		}
	}

}
