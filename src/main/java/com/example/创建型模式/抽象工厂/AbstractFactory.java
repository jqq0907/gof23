package com.example.创建型模式.抽象工厂;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/12 2:48 PM
 */
public interface AbstractFactory {
	AbstractProductA createProductA();

	AbstractProductB createProductB();
}
