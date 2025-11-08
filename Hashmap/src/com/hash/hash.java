package com.hash;

import java.util.HashMap;
import java.util.TreeMap;

public class hash {
public static void main(String[] args) {
	
	//HashMap hm = new HashMap();
	//LinkedHashMap hm = new LinkedHashMap();
	TreeMap hm = new TreeMap();
	hm.put(3,"Mango");
	hm.put(4,"Apple");
	hm.put(23,"orange");
	//hm.put("hi", "Welcome");
	hm.put(20, "hjj");
	System.out.println(hm);
	System.out.println(hm.containsKey(2));
}
}
