package com.example.结构性模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/24 7:12 PM
 */
public class GamePlayIH implements InvocationHandler {
	// 被代理者
	Class cls;
	// 被代理实例
	Object obj;

	public GamePlayIH(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object invoke = method.invoke(this.obj, args);
		// 如果是登录方法，则发送信息
		if (method.getName().equalsIgnoreCase("login")) {
			System.out.println("登录");
		}
		return invoke;
	}
}
