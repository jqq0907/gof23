package com.example.创建型模式.建造者模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/13 2:00 PM
 */
public abstract class Builder {
	// 设置产品的不同部分
	public abstract void setPart();

	// 建造产品
	public abstract Product buildProduct();
}
