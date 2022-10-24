package com.example.行为型模式.命令模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/17 4:05 PM
 */
public interface Receiver {
	/**
	 * 每个接受者都必须处理一定的业务逻辑
	 */
	void doSomethink();
}
