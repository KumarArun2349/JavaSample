package org.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class Array {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0] = 10; a[1]=20; a[2]=20; a[3]=30; a[4]=10;
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	/*Set<Integer> s = new LinkedHashSet<>();
	for (int j = 0; j < a.length; j++) {
		s.add(a[j]);
	}
	
	for (Integer integer : s) {
		System.out.println(integer);
	}*/
	/*
	Object a[]=new Object[2];
	a[0]="xyz";
	a[1]=123;
	a[2]='a';
	for (int i = 0; i < 2; i++) {
		System.out.println(a[i]);
	}*/
	
}
}
