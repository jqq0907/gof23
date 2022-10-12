package com.example.创建型模式.单例模式;

/**
 * @author jiangqiangqiang
 * @description: 懒汉式
 * @date 2022/10/12 10:58 AM
 */
public class SingletonL {
	private SingletonL instance;

	public SingletonL getInstance() {
		if (null == instance) {
			instance = new SingletonL();
		}
		return instance;
	}
}
