package com.example.行为型模式.责任链模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/18 10:30 AM
 */
public class Women implements IWomen{
	private int type = 0;
	private String request = "";

	public Women(int type, String request) {
		this.type = type;
		this.request = request;
	}

	@Override
	public int getType() {
		return type;
	}

	@Override
	public String getRequest() {
		return request;
	}
}
