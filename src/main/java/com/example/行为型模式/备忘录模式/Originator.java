package com.example.行为型模式.备忘录模式;

import javax.swing.*;

/**
 * @author jiangqiangqiang
 * @description: 发起人角色
 * @date 2022/10/20 10:17 AM
 */
public class Originator {
	// 内部状态
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 创建一个备忘录
	 * @return
	 */
	public Memento createMemento() {
		return new Memento(state);
	}

	/**
	 * 恢复一个备忘录
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}
}
