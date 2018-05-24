package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortAndReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList alObj = new ArrayList();
		alObj.add(2);
		alObj.add(1);
		alObj.add(4);
		alObj.add(2);
		alObj.add(5);
		System.out.println(alObj);
		// System.out.println(Collections.sort(alObj));// here we have to compar
		System.out.println(Collections.reverseOrder());// o/p:object
		// need to use comparator
		Collections.sort(alObj, Collections.reverseOrder());
		System.out.println(alObj);

	}

}
