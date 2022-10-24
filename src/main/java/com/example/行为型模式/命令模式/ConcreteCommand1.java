package com.example.行为型模式.命令模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/17 4:03 PM
 */
public class ConcreteCommand1 extends Command{
	private Receiver receiver;

	public ConcreteCommand1(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.doSomethink();
	}
}
