package com.example.创建型模式.单例模式;

/**
 * @author jiangqiangqiang
 * @description: 双重校验锁
 * @date 2022/10/12 10:58 AM
 */
public class SingletonDCL {
	private SingletonDCL() {}
	private volatile static SingletonDCL instance;

	public SingletonDCL getInstance() {
		if (null == instance) {
			synchronized (SingletonDCL.class) {
				if (null == instance) {
					instance = new SingletonDCL();
				}
			}
		}
		return instance;
	}
}
