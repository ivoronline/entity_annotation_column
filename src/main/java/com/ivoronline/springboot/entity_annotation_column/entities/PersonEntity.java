package com.ivoronline.springboot.entity_annotation_column.entities;

import javax.persistence.*;

@Entity
public class PersonEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;

  @Column(name="PERSON_NAME")
  public String  name;

  public Integer age;

}











