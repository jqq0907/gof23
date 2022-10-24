package com.example.行为型模式.备忘录模式;

/**
 * @author jiangqiangqiang
 * @description: 备忘录角色
 * @date 2022/10/20 10:18 AM
 */
public class Memento {
	String state;
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
