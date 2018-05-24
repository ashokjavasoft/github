package com.comparable;

public class Empcls {
	@Override
	public String toString() {
		return "Empcls [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	private int id;
	private String name;
	int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	/*public Empcls(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;

	}*/

}
