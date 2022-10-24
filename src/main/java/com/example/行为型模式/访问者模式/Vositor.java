package com.example.行为型模式.访问者模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/21 11:11 AM
 */
public class Vositor implements IVisitor{

	@Override
	public void visit(ConcreteElement1 element) {
		element.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 element) {
		element.doSomething();
	}
}
