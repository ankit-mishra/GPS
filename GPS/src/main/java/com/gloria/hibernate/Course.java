package com.gloria.hibernate;

// Generated Jul 6, 2012 9:04:44 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "gloria")
public class Course implements java.io.Serializable {

	private Integer courseId;

	public Course() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CourseID", unique = true, nullable = false)
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

}
