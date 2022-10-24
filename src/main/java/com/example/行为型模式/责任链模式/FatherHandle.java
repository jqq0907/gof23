package com.example.行为型模式.责任链模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/18 10:35 AM
 */
public class FatherHandle extends Handle {
	public FatherHandle() {
		super(Handle.FATHER_LEVEL);
	}

	@Override
	public void response(IWomen women) {
		System.out.println("father处理");

	}
}
