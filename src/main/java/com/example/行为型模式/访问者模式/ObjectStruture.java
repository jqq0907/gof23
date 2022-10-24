package com.example.行为型模式.访问者模式;

import java.util.Random;

/**
 * @author jiangqiangqiang
 * @description: 结构对象
 * @date 2022/10/21 11:13 AM
 */
public class ObjectStruture {

	public static Element createElement() {
		Random random = new Random();
		if (random.nextInt(100) > 50) {
			return new ConcreteElement1();
		} else {
			return new ConcreteElement2();
		}
	}
}
