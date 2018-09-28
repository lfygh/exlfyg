package com.lfyg.javabase;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class IntegerTest {
	public static void main(String[] args) {
		// 测试int 和Integer的比较
		int i1 = 127;
		Integer i2 = 127; // 自动装箱机制实际上调用Integer.valueof(127)
		Integer i3 = new Integer(127);
		Integer i4 = 127;
		System.out.println(i1 == i2); // true
		System.out.println(i1 == i3); // true
		System.out.println(i2 == i3); // false
		System.out.println(i2 == i4); // true (注意)
		System.out.println("---------------");
		int a1 = 128;
		Integer a2 = 128;
		Integer a3 = new Integer(128);
		Integer a4 = 128;
		System.out.println(a1 == a2); // true
		System.out.println(a1 == a3); // true 比较的是值相等
		System.out.println(a2 == a3); // false
		System.out.println(a2 == a4); // false （不同）不再缓冲池中，相当于new一个新对象。
		System.out.println(new IntegerTest().getClass().getSuperclass());
	}

}
