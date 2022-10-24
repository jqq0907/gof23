package com.example.行为型模式.策略模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/19 2:33 PM
 */
public class ConcreteStrategy1 implements Strategy{
	@Override
	public void doSomething() {
		System.out.println("具体策略1的运算规则");
	}
}
