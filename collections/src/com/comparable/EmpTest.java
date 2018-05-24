package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empcls ecObj = new Empcls();
		ecObj.setAge(10);
		ecObj.setId(1);
		ecObj.setName("ashok");
		System.out.println(ecObj.getAge() + " " + ecObj.getId() + " " + ecObj.getName());
		Empcls ecObj1 = new Empcls();
		ecObj1.setAge(11);
		ecObj1.setId(2);
		ecObj1.setName("1ashok");
		System.out.println(ecObj1.getAge() + " " + ecObj1.getId() + " " + ecObj1.getName());
		Empcls ecObj2 = new Empcls();
		ecObj2.setAge(13);
		ecObj2.setId(3);
		ecObj2.setName("2ashok");
		System.out.println(ecObj2.getAge() + " " + ecObj2.getId() + " " + ecObj2.getName());

		// System.out.println(ecObj);
		ArrayList<Empcls> alObj = new ArrayList();
		alObj.add(ecObj);
		alObj.add(ecObj1);
		alObj.add(ecObj2);
		/*Iterator<Empcls> i=alObj.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
		}*/
		System.out.println(alObj);
		//Collections.sort(alObj);
		for(Empcls ec:alObj){
			System.out.println(ec.getAge()+""+ec.getId()+""+ec.getName());
			
		}
		
	}}
