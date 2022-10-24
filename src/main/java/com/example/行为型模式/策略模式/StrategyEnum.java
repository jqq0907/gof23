package com.example.行为型模式.策略模式;

/**
 * @author jiangqiangqiang
 * @description: 枚举版策略模式
 * @date 2022/10/19 2:25 PM
 */
public enum StrategyEnum {
	ADD("+") {
		@Override
		public int exce(int a, int b) {
			return a + b;
		}
	},
	SUB("-") {
		@Override
		public int exce(int a, int b) {
			return a - b;
		}
	};
	String value;

	StrategyEnum(String value) {
		this.value = value;
	}

	/**
	 * 抽象函数
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	public abstract int exce(int a, int b);
}
