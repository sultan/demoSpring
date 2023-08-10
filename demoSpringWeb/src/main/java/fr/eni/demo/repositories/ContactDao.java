// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.repositories;

import java.util.List;

import fr.eni.demo.entities.Personne;

public interface ContactDao {

	public abstract void insert(Personne p);

	public abstract Personne selectById(int id);

	public abstract List<Personne> selectAll();

}
