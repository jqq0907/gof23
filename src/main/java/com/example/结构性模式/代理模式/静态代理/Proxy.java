package com.example.结构性模式.代理模式.静态代理;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/24 7:08 PM
 */
public class Proxy implements Subject{
	private Subject subject;

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	private void before() {

	}

	private void after() {

	}
}
