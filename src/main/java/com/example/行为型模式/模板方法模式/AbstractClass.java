package com.example.行为型模式.模板方法模式;

/**
 * @author jiangqiangqiang
 * @description: 抽象模板
 * @date 2022/10/17 10:15 AM
 */
public abstract class AbstractClass {
	/**
	 * 基本方法
	 */
	protected abstract void doSomething();

	/**
	 * 基本方法
	 */
	protected abstract void doAnything();

	/**
	 * 模板方法
	 */
	public void templateMethod() {
		// 调用模板方法，完成相关逻辑
		doSomething();
		doAnything();
	}
}
