package com.marcostota.study.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "character_op")
public class Characterop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "char_id")
	private Long id;

	@Column(name = "char_name")
	private String name;

	@Column(name = "char_age")
	private Integer age;

	@Column(name = "char_email")
	private String email;
}
