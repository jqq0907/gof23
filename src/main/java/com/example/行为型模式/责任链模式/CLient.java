package com.example.行为型模式.责任链模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/18 10:40 AM
 */
public class CLient {
	public static void main(String[] args) {
		IWomen women = new Women(1, "逛街");
		Handle father = new FatherHandle();
		Handle husband = new HusbandHandle();
		Handle son = new SonHandle();
		father.setNext(husband);
		husband.setNext(son);
		father.handleMessage(women);
	}
}
