package com.example.行为型模式.访问者模式;

/**
 * @author jiangqiangqiang
 * @description: 抽象元素
 * @date 2022/10/21 11:09 AM
 */
public abstract class Element {
	/**
	 * 业务逻辑
	 */
	public abstract void doSomething();

	/**
	 * 允许谁来访问
	 * @param visitor
	 */
	public abstract void accept(IVisitor visitor);
}
