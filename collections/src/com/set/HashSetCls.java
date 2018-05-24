package com.set;

public class HashSetCls {
	
	
	/*Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

	The important points about Java HashSet class are:

	HashSet stores the elements by using a mechanism called hashing.
	HashSet contains unique elements only.
	Difference between List and Set
	List can contain duplicate elements whereas Set contains unique elements only.

	Hierarchy of HashSet class
	The HashSet class extends AbstractSet class which implements Set interface. The Set interface inherits Collection and Iterable interfaces in hierarchical order.


	HashSet class declaration
	Let's see the declaration for java.util.HashSet class.

	public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  
	Constructors of Java HashSet class:
	Constructor	Description
	HashSet()	It is used to construct a default HashSet.
	HashSet(Collection c)	It is used to initialize the hash set by using the elements of the collection c.
	HashSet(int capacity)	It is used to initialize the capacity of the hash set to the given integer value capacity. The capacity grows automatically as elements are added to the HashSet.
	Methods of Java HashSet class:
	Method	Description:
	-------------------
	void clear()	It is used to remove all of the elements from this set.
	boolean  contains(Object o)	It is used to return true if this set contains the specified element.
	boolean  add(Object o)	It is used to adds the specified element to this set if it is not already present.
	boolean  isEmpty()	It is used to return true if this set contains no elements.
	boolean  remove(Object o)	It is used to remove the specified element from this set if it is present.
	Object   clone()	It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
	Iterator iterator()	It is used to return an iterator over the elements in this set.
	int size()	It is used to return the number of elements in this set.*/
}
