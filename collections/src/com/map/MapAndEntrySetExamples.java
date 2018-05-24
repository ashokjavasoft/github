package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapAndEntrySetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m = new HashMap();
		m.put(1, "ashok");
		m.put(2, "reddy");
		m.put(3, "ashokreddy");
		m.put(4, "ashok");
		System.out.println(m);
		for (Map.Entry me : m.entrySet()) {
			System.out.println(me.getValue() + " " + me.getKey());

		}
		Set sObj = m.entrySet();
		Iterator i = sObj.iterator();
		while (i.hasNext()) {
			Map.Entry meObj = (Entry) i.next();
			System.out.println(meObj.getKey() + " " + meObj.getValue());

		}

	}

}
