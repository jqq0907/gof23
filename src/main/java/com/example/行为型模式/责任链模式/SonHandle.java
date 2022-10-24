package com.example.行为型模式.责任链模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/18 10:35 AM
 */
public class SonHandle extends Handle {
	public SonHandle() {
		super(Handle.SON_LEVEL);
	}
	@Override
	public void response(IWomen women) {
		System.out.println("son处理");
	}
}
