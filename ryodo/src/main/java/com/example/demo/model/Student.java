package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student"  ,  schema="mappingpractice")
public class Student {
@Id
@GeneratedValue
private int id ;
private String name ;
private int classroomid ;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the classroomid
 */
public int getClassroomid() {
	return classroomid;
}
/**
 * @param classroomid the classroomid to set
 */
public void setClassroomid(int classroomid) {
	this.classroomid = classroomid;
}	
	
	
}
