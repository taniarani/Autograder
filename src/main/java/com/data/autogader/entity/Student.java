package com.data.autogader.entity;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student", schema = "autograder_metadatainfo")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence_generator")
	@SequenceGenerator(name = "hibernate_sequence_generator", sequenceName = "autograder_metadatainfo.hibernate_sequence", allocationSize = 1)

	private int id;
	@Column(name = "first_name")

	private String first_Name;
	@Column(name = "professor_name")

	private String middle_Name;
	@Column(name = "last_name")

	private String last_Name;
	@Column(name = "dob")

	private Date dob;
	@Column(name = "student_number")

	private String student_Number;
	@Column(name = "course_id")

	private int course_id;
	@Column(name = "profile_image_name")
	private Blob profile_image_Name;

	@Column(name = "username")

	private String username;
	@Column(name = "password")

	private String password;

}
