package com.jaceksysiak.spring.test;

public class Person {
	
	private Integer id;
	private String name;
	
	public Person(){}
	
	  
	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

 
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}




	public void speak(){
		System.out.println("Hello I'am a person.");
	}
 

 




	
	
}
