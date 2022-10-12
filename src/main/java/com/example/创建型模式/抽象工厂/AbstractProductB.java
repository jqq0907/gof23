package com.example.创建型模式.抽象工厂;

/**
 * @author jiangqiangqiang
 * @description: B产品系列
 * @date 2022/10/12 2:24 PM
 */
public abstract class AbstractProductB {
	protected String type = "B型产品";

	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/** 每个产品具体实现该方法 */
	public abstract void doSomething();
}
