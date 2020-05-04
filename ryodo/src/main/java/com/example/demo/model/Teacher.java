package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacher"  ,  schema="mappingpractice")
public class Teacher {

	
	@Id
    @GeneratedValue
	private int teacherid;
	private String teachername ;
	private int classroomid ;
	
	
	@OneToMany(targetEntity=Classroom.class)
	@JoinColumn(name="classroomid" , referencedColumnName="classroomid")
	private List<Classroom>  classroomlist ;

	/**
	 * @return the teacherid
	 */
	
	
	
	public int getTeacherid() {
		return teacherid;
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

	/**
	 * @param teacherid the teacherid to set
	 */
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	/**
	 * @return the teachername
	 */
	public String getTeachername() {
		return teachername;
	}

	/**
	 * @param teachername the teachername to set
	 */
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

	/**
	 * @return the classroomlist
	 */
	public List<Classroom> getClassroomlist() {
		return classroomlist;
	}

	/**
	 * @param classroomlist the classroomlist to set
	 */
	public void setClassroomlist(List<Classroom> classroomlist) {
		this.classroomlist = classroomlist;
	}
	
	
	
	
}
