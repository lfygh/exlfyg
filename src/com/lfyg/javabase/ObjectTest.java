package com.lfyg.javabase;

import java.util.ArrayList;


public class ObjectTest {

	private Integer param1;
	private String param2;

	public static void main(String[] args)  {
		ObjectTest objectTest  = new ObjectTest();
		try {
			ObjectTest objectTest2 = (ObjectTest) objectTest.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass()) // 根据等号判断类型信息是否相等
			return false;

		ObjectTest that = (ObjectTest) obj;

		if (this.param1 != that.param1)
			return false;
		return this.param2 == that.param2;
	}

	// 重写hashcode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 17;
		result = result * 31 + param1;
		result = result * 31 + param2.hashCode();
		return result;
	}
	
	
	/**
	 * Object的clone方法的访问控制符为protected。
	 * 如果不显示的重写clone()方法，其他类就不能直接调用该实例的方法。
	 * 
	 * 因此修改访问控制符为public。
	 * 抛出异常是因为没有实现Cloneable接口。
	 */
	@Override
	public ObjectTest clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (ObjectTest)super.clone();
	}

}

class Parent {

}

class Child extends Parent {

}
