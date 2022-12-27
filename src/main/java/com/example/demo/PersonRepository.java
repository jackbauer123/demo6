package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * A repository to manage {@link Person2} instances.
 *
 * @author Greg Turnquist
 * @author Oliver Gierke
 */
public interface PersonRepository extends CrudRepository<Person2, Integer> {}