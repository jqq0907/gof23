package com.example.行为型模式.责任链模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/18 10:28 AM
 */
public abstract class Handle {
	public final static int FATHER_LEVEL = 1;
	public final static int HUSBAND_LEVEL = 2;
	public final static int SON_LEVEL = 3;
	/**
	 * 能处理的级别
	 */
	private int level;
	/**
	 * 下一个责任人
	 */
	private Handle next;

	public Handle(int level) {
		this.level = level;
	}
	public final void handleMessage(IWomen women) {
		if (women.getType() == this.level) {
			this.response(women);
		} else if (this.next != null) {
			this.next.handleMessage(women);
		} else {
			System.out.println("没有下层处理");
		}
	}

	public void setNext(Handle next) {
		this.next = next;
	}

	public abstract void response(IWomen women);
}
