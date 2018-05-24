package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> alObj = new ArrayList<Object>();
		List object= new ArrayList<>();
	/*	Array [] a= new Array[];*/
		alObj.add("a");
		alObj.add(1);
		alObj.add("ashok");
		alObj.add(2);
		System.out.println(alObj);
		// or
		Iterator<Object> iObj = alObj.iterator();
		while (iObj.hasNext()) {
			System.out.println(iObj.next());
		}
		Collections.replaceAll(alObj, "a", "j");
		System.out.println(alObj);
		System.out.println(22>>1);
		
	}

}
