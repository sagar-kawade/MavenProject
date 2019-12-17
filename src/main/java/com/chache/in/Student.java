package com.chache.in;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
int id;
String name;
int marks;
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}


}
