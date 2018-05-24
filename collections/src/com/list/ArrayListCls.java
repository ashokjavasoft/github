package com.list;

import java.util.List;

public class ArrayListCls {

	/*Java ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.

	The important points about Java ArrayList class are:

	Java ArrayList class can contain duplicate elements.
	Java ArrayList class maintains insertion order.
	Java ArrayList class is non synchronized.
	Java ArrayList allows random access because array works at the index basis.
	In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
	Hierarchy of ArrayList class
	As shown in above diagram, Java ArrayList class extends AbstractList class which implements List interface. The List interface extends Collection and Iterable interfaces in hierarchical order.

	ArrayList class declaration
	Let's see the declaration for java.util.ArrayList class.

	public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable  
	Constructors of Java ArrayList
	Constructor	Description
	
	ArrayList()	It is used to build an empty array list.
	ArrayList(Collection c)	It is used to build an array list that is initialized with the elements of the collection c.
	ArrayList(int capacity)	It is used to build an array list that has the specified initial capacity.
	Methods of Java ArrayList
	
	Method	Description
	
	void add(int index, Object element)	It is used to insert the specified element at the specified position index in a list.
	boolean addAll(Collection c)	It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	void clear()	It is used to remove all of the elements from this list.
	int lastIndexOf(Object o)	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
	Object[] toArray()	It is used to return an array containing all of the elements in this list in the correct order.
	Object[] toArray(Object[] a)	It is used to return an array containing all of the elements in this list in the correct order.
	boolean add(Object o)	It is used to append the specified element to the end of a list.
	boolean addAll(int index, Collection c)	It is used to insert all of the elements in the specified collection into this list, starting at the specified position.
	Object clone()	It is used to return a shallow copy of an ArrayList.
	int indexOf(Object o)	It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
	void trimToSize()	It is used to trim the capacity of this ArrayList instance to be the list's current size.
*/
}
