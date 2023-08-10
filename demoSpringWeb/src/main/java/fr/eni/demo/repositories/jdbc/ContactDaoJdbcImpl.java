// Copyright (c) 2023 the original author or authors. //

package fr.eni.demo.repositories.jdbc;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Repository;

import fr.eni.demo.entities.Personne;
import fr.eni.demo.repositories.ContactDao;

@Repository
@Profile("default")
public class ContactDaoJdbcImpl implements ContactDao {

	private NamedParameterJdbcOperations jdbc;

	public ContactDaoJdbcImpl(NamedParameterJdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public void insert(Personne p) {
		String sqlInsert = " INSERT INTO personnes ( prenom , nom ) VALUES ( :prenom , :nom ) ";
		jdbc.update(sqlInsert, new BeanPropertySqlParameterSource(p));
	}

	@Override
	public Personne selectById(int id) {
		String sqlSelectById = " SELECT * FROM personnes WHERE id = ? ";
		return jdbc.getJdbcOperations().queryForObject(sqlSelectById, //
				new BeanPropertyRowMapper<>(Personne.class), id);
	}

	@Override
	public List<Personne> selectAll() {
		String sqlSelectAll = " SELECT * FROM personnes ";
		return jdbc.getJdbcOperations().query(sqlSelectAll, //
				new BeanPropertyRowMapper<>(Personne.class));
	}

}
