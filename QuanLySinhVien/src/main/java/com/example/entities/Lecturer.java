package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lecturer_id;

	private String lecturer_name;

	@OneToOne(mappedBy = "lecturer")
	private User user;
}
