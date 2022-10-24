package com.example.行为型模式.策略模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/19 2:32 PM
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 封装后的策略方法
	 */
	public void doAnything() {
		strategy.doSomething();
	}

}
