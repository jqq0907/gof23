package com.example.行为型模式.访问者模式;

/**
 * @author jiangqiangqiang
 * @description: 抽象访问者
 * @date 2022/10/21 11:02 AM
 */
public interface IVisitor {
	void visit(ConcreteElement1 element);
	void visit(ConcreteElement2 element);
}
