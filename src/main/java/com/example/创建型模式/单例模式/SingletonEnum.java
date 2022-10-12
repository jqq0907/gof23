package com.example.创建型模式.单例模式;

/**
 * @author jiangqiangqiang
 * @description: 枚举
 * @date 2022/10/12 10:58 AM
 */
public enum SingletonEnum {
	// 唯一实例对象
	INSTANCE;
	public static SingletonEnum getInstance() {
		return INSTANCE;
	}

	// 单例对象的属性对象
	private final Object obj = new Object();
	public Object getObj() {
		return obj;
	}

	/**
	 * 单例提供的对外服务。
	 */
	public Object getFactoryService() {
		return new Object();
	}
}
