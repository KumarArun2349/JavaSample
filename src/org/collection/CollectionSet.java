package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {
public static void main(String[] args) {
	Set s1=new HashSet();
	
	s1.add("Arun");
	s1.add(29101998);
	s1.add('K');
	s1.add(null);
	s1.add(null);
	s1.add('K');
	System.out.println(s1);
	boolean remove = s1.remove('K');
	s1.removeAll(s1);
	
	System.out.println(s1);
	
	
	Set s2=new LinkedHashSet();
	s2.add("MSD");
	s2.add(771981);
	s2.add('K');
	s2.add(null);
	s2.add(null);
	System.out.println(s2);
	int size = s2.size();
	System.out.println(size);
	
	Set<String> s3=new TreeSet<>();
	s3.add("Thalapathi");
	s3.add("22061974");
	s3.add("K");
	s3.add(null);
	System.out.println(s3);
	
	s1.addAll(s2);
	System.out.println(s1);
	
}
}
