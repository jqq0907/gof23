package com.example.结构性模式.装饰模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/21 5:41 PM
 */
public class ConcreteConponent extends Component{
	@Override
	public void operate() {
		System.out.println("do something");
	}
}
