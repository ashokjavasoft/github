package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lObj = new LinkedList<Integer>();
		LinkedList<Object> lObj1 = new LinkedList<Object>();
		lObj.add(1);
		lObj.add(2);
		lObj1.addAll(lObj1);
		lObj.add(1);
		lObj.add(2);
		lObj.add(1);
		lObj.add(2);
		System.out.println("1 " + lObj);
		System.out.println("2 " + lObj1);
		System.out.println("3 " + lObj.get(3));
		System.out.println("4 " + lObj.getFirst());
		System.out.println("5 " + lObj.getLast());
		System.out.println("5 " + lObj.size());
		System.out.println("6 " + lObj.containsAll(lObj1));
		Collections.sort(lObj);
		for (Object obj : lObj) {
			System.out.println("7 " + obj);
		}
		System.out.println("8 " + lObj.isEmpty());
		// System.out.println("9 "+lObj.indexOf(2));
		System.out.println("10 " + lObj.removeLast());
		System.out.println("11 " + lObj);
		/*
		 * Collections.reverse(lObj); for (Object o1 : lObj) {
		 * System.out.println(01); }
		 */

	}

}
