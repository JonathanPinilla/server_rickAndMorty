package com.jonathan.server.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "characters")
public class CharactersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "species")
    private String species;

    @Column(name = "type")
    private String type;

    @Column(name = "gender")
    private String gender;

    @Column(name = "origin")
    private String origin;

    @Column(name = "location")
    private String location;

    @Column(name = "image")
    private String image;

    @Column(name = "episode")
    private String episode;

    @Column(name = "url")
    private String url;

    @Column(name = "created")
    private String created;

}
