package com.collections;

import java.util.ArrayList;
import java.util.*;

public class AddAll extends Collectionscls {
	public static void main(String a[]) {
		List<String> listObject = new ArrayList<String>();
		listObject.add("1");
		listObject.add("ashok");
		listObject.add("2");
		listObject.add("3");
		listObject.add("ashokreddy");
		listObject.add("4");
		System.out.println(listObject);
		Collections.addAll(listObject, "1", "muthu");
		System.out.println(listObject);
		String[] s = { "reddy", "reddy2", "reddy3" };
		Collections.addAll(listObject, s);
		System.out.println(listObject);
		List<Object> lObj = new ArrayList<Object>();
		lObj.add(1);
		lObj.add("cp");
		System.out.println(lObj);
		// Collections.addAll(listObject,lObj);-->not possible

	}

}
