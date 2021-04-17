package com.michaelsoiu.dandn.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michaelsoiu.dandn.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	public List<Dojo> findAll();
}
