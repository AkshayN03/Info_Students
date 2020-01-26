/**
 * 
 */
package com.akshay.student.dal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author :AKSHAY N
 * @date   :26-Jan-2020
 * @description:
 */

@Entity
@Table(name="Studenttab")
public class Student {
	@Id
	private int id;
	@Column
	private String Sname;
	@Column
	private String scourse;
	@Column
	private int Sfee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public int getSfee() {
		return Sfee;
	}
	public void setSfee(int sfee) {
		Sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Sname=" + Sname + ", scourse=" + scourse + ", Sfee=" + Sfee + "]";
	}

}
