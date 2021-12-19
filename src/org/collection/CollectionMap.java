package org.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CollectionMap {
public static void main(String[] args) {
	Map<String, Integer> m1 = new HashMap<>();
	m1.put("CSK", 6);
	m1.put("RCB", 6);
	m1.put(null, null);
	m1.put("DC", 4);
	System.out.println(m1.size());
	
	boolean containsKey = m1.containsKey("CSK");
	System.out.println(containsKey);
	
	boolean containsValue = m1.containsValue(0);
	System.out.println(containsValue);
	
	m1.remove("CSK");
	
	Set<String> keySet = m1.keySet();
	System.out.println(keySet);
	
	Collection<Integer> values = m1.values();
	System.out.println(values);
	
	Set<Entry<String, Integer>> entrySet = m1.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		System.out.println(entry);
		String key = entry.getKey();
		
		System.out.println(key);
		Integer value = entry.getValue();
		System.out.println(value);
	}
	
	m1.replace("RCB", 4);
	
	System.out.println(m1);
	
	
	Map<String, Integer> m2 = new LinkedHashMap<>();
	m2.put("CSK", 8);
	m2.put("CSK", 8);
	m2.put("RCB", 6);
	m2.put("DC", 8);
	m2.put("MI", 4);
	m2.put(null, null);
	System.out.println("\n"+m2);
	
	Map<String, Integer> m3 = new TreeMap<>();
	m3.put("CSK", 8);
	m3.put("CSK", 8);
	m3.put("RCB", 6);
	m3.put("DC", 8);
	m3.put("MI", null);
	System.out.println("\n"+m3);
	
	Map<String, Integer> m4 = new Hashtable<>();
	m4.put("RR", 4);
	int size = m4.size();
	System.out.println(size);
	boolean containsKey2 = m4.containsKey("RR");
	System.out.println(containsKey2);
	boolean containsValue2 = m4.containsValue(6);
	System.out.println(containsValue2);
	Set<String> keySet2 = m4.keySet();
	System.out.println(keySet2);
	Collection<Integer> values2 = m4.values();
	System.out.println(values2);
	Set<Entry<String, Integer>> entrySet2 = m4.entrySet();
	for (Entry<String, Integer> entry : entrySet2) {
		System.out.println(entry);
		String key = entry.getKey();
		System.out.println(key);
		Integer value = entry.getValue();
		System.out.println(value);
	}
	
}
}