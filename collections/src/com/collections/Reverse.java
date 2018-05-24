package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
	public static void main(String a[]){
	ArrayList<Object> aObj=new ArrayList<Object>();
	aObj.add(1);
	aObj.add("ashok");
	aObj.add("reddy");
	System.out.println(aObj);
	Collections.reverse(aObj);
	System.out.println(aObj);
	}
}
