package com.example.结构性模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/24 7:16 PM
 */
public class Client {
	public static void main(String[] args) {
		IGamePlayer gamePlayer = new GamePlayer("张三");
		InvocationHandler iv = new GamePlayIH(gamePlayer);
		ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{GamePlayer.class}, iv);
		proxy.killBoss();

	}
}
