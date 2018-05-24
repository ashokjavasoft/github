package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

public class HashSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hsObj=new HashSet<>();
		hsObj.add("1");
		hsObj.add("2");
		hsObj.add("3");
		hsObj.add("8");
		hsObj.add("5");
		hsObj.add("6");
		hsObj.add("1");
		hsObj.add("2");
		hsObj.add("3");
		hsObj.add(null);
		hsObj.add(null);
		hsObj.add(null);
		System.out.println("1 "+hsObj);
		Iterator<String> iObj=hsObj.iterator();
		while(iObj.hasNext()){
			System.out.println(iObj.next());
		}
			System.out.println("2 "+hsObj.getClass());
	/*	Spliterator<String> sObj=hsObj.spliterator();
		System.out.println("3 "+sObj);*/
			System.out.println("4 "+hsObj.isEmpty());
			//System.out.println(hsObj.);
		}

	}

