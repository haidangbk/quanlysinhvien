package com.example.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

	private String email;

	private String user_password;

	private String phone_number;

	private int flag_delete;

	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private Role role;

	@OneToOne(mappedBy="user")
	private Student student;

	@OneToOne(mappedBy = "userLec")
	private Lecturer lecturer;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "user_course", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "course_id") })
	Set<Course> courses = new HashSet<>();

}
