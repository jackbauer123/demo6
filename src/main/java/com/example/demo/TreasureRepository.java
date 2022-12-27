package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * A repository to manage {@link Treasure2}s.
 *
 * @author Greg Turnquist
 * @author Oliver Gierke
 */
public interface TreasureRepository extends CrudRepository<Treasure2, Integer> {}