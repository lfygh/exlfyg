package com.lfyg.javabase;


public class ShortTest {

	public static void main(String[] args) {
		short s1 = 1;
		// s1 = s1 + 1; //错误 运算时会自动提升变量的类型，因此s1+1的结果为int类型。
		// 再赋值给short类型就会报强制类型转化错误。

		s1 += 1;      //+=是java语言规定的运算符，编译器会特殊处理。
		

	}
}
