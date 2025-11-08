package com.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hash_generic {
public static void main(String[] args) {
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(3, "Mango");
	hm.put(2,"Pineapple");
	hm.put(4,"Apple");
	hm.put(23,"orange");
//	Set<Integer> s = hm.keySet();
//	for(int x:s)
//	{
//		System.out.println(x);
//	}
//	Collection<String> c = hm.values();
//	for(String str:c)
//	{
//		System.out.println(str);
//	}
	for(Map.Entry<Integer, String> m:hm.entrySet())
	{
		System.out.println(m.getKey() +" " +m.getValue());
	}
}
}
