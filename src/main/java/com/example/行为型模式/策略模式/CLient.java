package com.example.行为型模式.策略模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/19 2:35 PM
 */
public class CLient {
	public static void main(String[] args) {
		Strategy strategy1 = new ConcreteStrategy1();
		Context context = new Context(strategy1);
		context.doAnything();
	}
}
