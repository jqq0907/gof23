package com.example.行为型模式.访问者模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/21 11:10 AM
 */
public class ConcreteElement1 extends Element{
	@Override
	public void doSomething() {

	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
