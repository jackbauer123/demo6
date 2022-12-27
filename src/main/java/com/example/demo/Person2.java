package com.example.demo;


import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * A person.
 *
 * @author Greg Turnquist
 * @author Oliver Gierke
 */

@Entity
@Data
@RequiredArgsConstructor
public class Person2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private  String firstName;
	@NonNull
	private  String lastName;


}