package com.lfyg.collection;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/**
 * 模拟ArrayList源码，分析ArrayList的几个重要函数的实现
 * 
 * ArrayList特点： 基于动态数组实现，支持随机访问
 * 
 * @author lfyg
 * 
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>,
		RandomAccess, Cloneable, Serializable {

	private static final int DEFAULT_CAPACITY = 10; // 默认初始化大小为10
	private static final Object[] EMPTY_ELEMENTDATA = {}; // 共享共对象数组

	/*
	 * 1、为什么要设计为transient? 难道最重要的元素不希望被序列化吗？
	 * 
	 *  查资料了解到，此处使用transient关键字是为了自定义序列化操作。
	 *  假如elementData的长度为10，然而其中实际上只有5个元素，那么只需要序列化其中的5个元素。所以
	 *  将elementData定义为transient，避免了java自带的序列化机制，并定义了writeObject和readObject两个方法，实现自己的序列化操作。
	 */
	private transient Object[] elementData; // 元素实际存储的地方，当第一次添加数据时会将数组大小扩展为默认大小
	private int size; // 实际包含的元素多少

	public ArrayList(int initalCapacity) {
		if (initalCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity"
					+ initalCapacity);
		}
		this.elementData = new Object[initalCapacity];
	}

	public ArrayList() {
		this.elementData = EMPTY_ELEMENTDATA;
	}

	/**
	 * 
	 */
	public boolean add(E e) {
		ensureCapacityInternal(size + 1);
		elementData[size++] = e;
		return true;
	}

	/**
	 * 确保数组内部容量
	 * 
	 * @param minCapacity
	 */
	private void ensureCapacityInternal(int minCapacity) { // minCapacity =
															// size+1;
		// TODO Auto-generated method stub
		if (elementData == EMPTY_ELEMENTDATA) {
			minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
		}
		ensureExplicitCapacity(minCapacity);
	}

	private void ensureExplicitCapacity(int minCapacity) {
		// modCount++;
		if (minCapacity - elementData.length > 0) {
			grow(minCapacity);
		}
	}

	/**
	 * 扩容操作，新容量的大小为旧容量大小的1.5倍。
	 * 
	 * @param minCapacity
	 */
	private void grow(int minCapacity) {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);

	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	/**
	 * 序列化ArrayList时调用的方法，只序列化数组中有元素填充那部分内容。
	 * @param s
	 */
	private void writeObject(java.io.ObjectOutputStream s) {
		
	}
	
	/**
	 * 反序列化
	 * @param i
	 */
	private void readObject(java.io.ObjectInputStream i) {
		
	}
}
