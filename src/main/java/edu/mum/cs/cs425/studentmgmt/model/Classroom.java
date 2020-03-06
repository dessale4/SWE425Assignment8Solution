package edu.mum.cs.cs425.studentmgmt.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long classroomId;
	private String buildingName;
	private Integer roomNumber;
	@OneToMany(cascade = CascadeType.PERSIST,mappedBy = "classRoom")
	private List<Student> students = new ArrayList<Student>();
	public Classroom() {
		
	}
public Classroom(String buildingName, Integer roomNumber) {
	
	this.buildingName = buildingName;
	this.roomNumber = roomNumber;
}
public Long getClassroomId() {
	return classroomId;
}
public void setClassroomId(Long classroomId) {
	this.classroomId = classroomId;
}
public String getBuildingName() {
	return buildingName;
}
public void setBuildingName(String buildingName) {
	this.buildingName = buildingName;
}
public Integer getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(Integer roomNumber) {
	this.roomNumber = roomNumber;
}
	
	
	
	
	
	
}
