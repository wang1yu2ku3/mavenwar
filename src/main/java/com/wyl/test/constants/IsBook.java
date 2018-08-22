/**
 * 
 */
package com.wyl.test.constants;

/**
 * @author Administrator
 *
 */
public enum IsBook {
	Yes(1,"是"),
	No(2,"否");
	
	 private String name;
	 private int value;
	 
	 private IsBook(int value,String name) {
		 this.value = value;
		 this.name = name;
	 }
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	 
	 

}
