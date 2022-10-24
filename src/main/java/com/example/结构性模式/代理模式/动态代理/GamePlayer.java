package com.example.结构性模式.代理模式.动态代理;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/24 7:19 PM
 */
public class GamePlayer implements IGamePlayer{
	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void login(String user, String password) {
		System.out.println(user + "在登录，密码是" + password);
	}

	@Override
	public void killBoss() {
		System.out.println(name + "在打怪");
	}
}
