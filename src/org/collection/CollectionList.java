package org.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		List li = new ArrayList();
		// 1
		li.add("arun");
		li.add('K');
		li.add(10);
		li.add(123456);
		li.add(987654321);
		li.add(12345.12345);
		li.add(true);
		System.out.println(li);
		// 2
		int size = li.size();
		System.out.println(size);
		// 3
		Object object = li.get(5);
		System.out.println(object);
		// 4
		Object set = li.set(1, "AK");
		System.out.println(li);
		// 5
		Object remove = li.remove(6);
		System.out.println(li);
		// 6
		li.add(6, false);
		System.out.println(li);
		// 7
		boolean contains = li.contains("KA");
		System.out.println(contains);
		// 8
		int indexOf = li.indexOf("AK");
		System.out.println(indexOf);
		// 9
		int lastIndexOf = li.lastIndexOf(false);
		System.out.println(lastIndexOf);

		li.add(2, false);
		System.out.println(li);

		int indexOf2 = li.indexOf(false);
		System.out.println(indexOf2);

		int lastIndexOf2 = li.lastIndexOf(false);
		System.out.println(lastIndexOf2);

		List l1 = new LinkedList();
		// 10
		l1.addAll(li);
		System.out.println("L1: " + l1);
		// 11
		li.removeAll(li);
		System.out.println(li);
		li.addAll(l1);
		System.out.println(li);
		l1.add(8, 20);
		li.add(8, 30);
		System.out.println("Final L1: " + l1);
		System.out.println("Final Li: " + li);
		li.set(3, 100);
		System.out.println(li);
		// 12
		li.retainAll(l1);
		System.out.println(li);
	}
}