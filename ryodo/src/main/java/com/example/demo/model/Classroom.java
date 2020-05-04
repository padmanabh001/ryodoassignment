package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="classroom"  ,  schema="mappingpractice")
public class Classroom {
    @Id
    @GeneratedValue
	private int classroomid;
	private String classname ;
	
	@OneToMany(targetEntity=Student.class)
	@JoinColumn(name="classroomid" , referencedColumnName="classroomid")
	private List<Student>  studentlist ;

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

	/**
	 * @return the classname
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * @param classname the classname to set
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}

	/**
	 * @return the studentlist
	 */
	public List<Student> getStudentlist() {
		return studentlist;
	}

	/**
	 * @param studentlist the studentlist to set
	 */
	public void setStudentlist(List<Student> studentlist) {
		this.studentlist = studentlist;
	}
	
	
	
	
}
