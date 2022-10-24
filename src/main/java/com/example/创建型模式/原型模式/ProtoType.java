package com.example.创建型模式.原型模式;

/**
 * @author jiangqiangqiang
 * @description:
 * @date 2022/10/13 2:13 PM
 */
public class ProtoType implements Cloneable{

	public ProtoType clone() {
		ProtoType protoType =null;
		try {
			protoType = (ProtoType)super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		return protoType;
	}
}
