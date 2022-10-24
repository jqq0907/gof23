package com.example.结构性模式.装饰模式;

/**
 * @author jiangqiangqiang
 * @description: 抽象装饰着
 * @date 2022/10/21 5:42 PM
 */
public abstract class Decorator extends Component{
	private Component component;

	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {
		this.component.operate();
	}
}
