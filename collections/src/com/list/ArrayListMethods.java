package com.list;

import java.util.ArrayList;
import java.util.Spliterator;

public class ArrayListMethods  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> alObject = new ArrayList<>();
		ArrayList<Object> alObj1 = new ArrayList<>();
		System.out.println(alObject.add("ashok"));
		System.out.println(alObject.add(null));
		System.out.println(alObject.add(""));
		alObject.add("reddy");
		alObject.add("java");
		alObject.add("ashok");
		alObject.add("reddy");
		alObject.add("java");
		System.out.println(alObject);
		alObject.add(1, "ashok");// -->add(index,element);
		System.out.println(alObject);
		alObject.addAll(alObject);
		System.out.println(alObject);// collection+collection
		alObject.addAll(1, alObject);
		System.out.println(alObject);
		System.out.println(alObject.size());
		System.out.println(alObject.contains("reddy"));// if Object is have in
														// ArrayList it return
														// true other wise it
														// return false
		System.out.println("32 line ::"+alObject.containsAll(alObj1));
		Object[] object1 = alObject.toArray();
		System.out.println(object1[0]);
		System.out.println(alObject.get(1));
		// System.out.println(alObject.indexOf());
		Spliterator<Object> s = alObject.spliterator();
		System.out.println(s.characteristics());
		System.out.println(alObject.isEmpty());
		System.out.println(alObj1.isEmpty());
		System.out.println(alObject.remove(1));
		System.out.println(alObject);
		// System.out.println(alObject.lastIndexOf(alObject));
		System.out.println(alObject.getClass());
		System.out.println(alObject.set(1, "ashok"));

	}

}
