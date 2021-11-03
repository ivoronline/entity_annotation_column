package com.ivoronline.springboot.entity_annotation_column.repositories;

import com.ivoronline.springboot.entity_annotation_column.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
