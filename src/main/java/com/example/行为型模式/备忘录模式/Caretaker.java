package com.example.行为型模式.备忘录模式;

/**
 * @author jiangqiangqiang
 * @description: 备忘录管理员角色
 * @date 2022/10/20 10:21 AM
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
