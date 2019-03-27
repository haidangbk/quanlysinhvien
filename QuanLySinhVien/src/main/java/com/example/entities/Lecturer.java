package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lecturer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lecturer {

	@Id
	@Column(name="lecturer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lecturer_id;

	private String lecturer_name;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User userLec;
	
}
