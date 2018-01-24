package com.apirest;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView
    private int id;

    public int getId() {
        return id;
    }


}
