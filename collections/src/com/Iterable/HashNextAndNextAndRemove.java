package com.Iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class HashNextAndNextAndRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList alObj = new ArrayList();
		alObj.add(1);
		alObj.add(2);
		alObj.add(1);
		alObj.add(2);
		alObj.add(1);
		alObj.add(2);
		System.out.println(alObj);
		Iterator iObj = alObj.iterator();
		while (iObj.hasNext()) {
			System.out.println(iObj.next());
			iObj.remove();

		}

	}

}
