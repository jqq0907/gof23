package com.example.创建型模式.单例模式;

/**
 * @author jiangqiangqiang
 * @description: 内部静态模式
 * @date 2022/10/12 10:58 AM
 */
public class SingletonJ {
	public static SingletonJ getInstance() {
		return InnerClass.INSTANCE;
	}
	public static class InnerClass {
		private InnerClass() {
		}
		public static final SingletonJ INSTANCE = new SingletonJ();
	}
}
