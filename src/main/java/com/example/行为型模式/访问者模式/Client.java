package com.example.行为型模式.访问者模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/21 11:14 AM
 */
public class Client {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			// 获取元素对象
			Element element = ObjectStruture.createElement();
			// 接受访问者访问
			element.accept(new Vositor());
		}
	}
}
