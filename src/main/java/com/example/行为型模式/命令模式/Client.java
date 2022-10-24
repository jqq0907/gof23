package com.example.行为型模式.命令模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/17 4:10 PM
 */
public class Client {
	public static void main(String[] args) {
		// 声明调用者
		Invoker invoker = new Invoker();
		// 定义接受者
		Receiver receiver = new ConcreteReciver1();
		// 定义一个发送给接受者的命令
		Command c1 = new ConcreteCommand1(receiver);
		invoker.setCommand(c1);
		invoker.action();
	}
}
