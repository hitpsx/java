package com.pojo;

public interface API {
	public int getMainId(String name);
	public void add(Product p);
	public void delete(String name);
	public void change(String name,float  age,String origin);
}
