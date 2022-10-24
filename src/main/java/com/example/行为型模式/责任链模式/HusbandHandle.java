package com.example.行为型模式.责任链模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/18 10:35 AM
 */
public class HusbandHandle extends Handle {
	public HusbandHandle() {
		super(Handle.HUSBAND_LEVEL);
	}
	@Override
	public void response(IWomen women) {
		System.out.println("husband处理");
	}
}
