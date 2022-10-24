package com.example.行为型模式.命令模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/17 4:07 PM
 */
public class Invoker {
	/**
	 * 什么命令
	 */
	private Command command;

	public Command getCommand() {
		return command;
	}

	/**
	 * 发出命令
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	/**
	 * 执行命令
	 */
	public void action() {
		command.execute();
	}
}
