package com.example.行为型模式.备忘录模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/20 10:22 AM
 */
public class Client {
	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		// 创建一个备忘录
		caretaker.setMemento(originator.createMemento());
		// 恢复一个备忘录
		originator.restoreMemento(caretaker.getMemento());
	}
}
