package com.web4jobs.formation.spring.dao;

import java.util.Collection;

import com.web4jobs.formation.spring.model.Formateur;

public interface FormateurDao {
	void create(Formateur f);

	void update(Formateur f);

	void delete(Formateur f);

	Collection<Formateur> findAll();

	Formateur find(Long id);
}
