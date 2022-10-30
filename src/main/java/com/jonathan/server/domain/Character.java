package com.jonathan.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "characters")
public class Character {

    /**
     * id of a character
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * name of a character
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * status of a character
     */
    @Column(name = "status", nullable = false)
    private String status;

    /**
     * species of a character
     */
    @Column(name = "species", nullable = false)
    private String species;

    /**
     * type of character
     */
    @Column(name = "type", nullable = false)
    private String type;

    /**
     * gender of a character
     */
    @Column(name = "gender", nullable = false)
    private String gender;

    /**
     * origin of a character
     */
    @Column(name = "origin", nullable = false)
    private String origin;

    /**
     * location of a character
     */
    @Column(name = "location", nullable = false)
    private String location;

    /**
     * image of a character
     */
    @Column(name = "image", nullable = false)
    private String image;

    /**
     * episode of a character
     */
    @Column(name = "episode", nullable = false)
    private String episode;

    /**
     * url of a character
     */
    @Column(name = "url", nullable = false)
    private String url;

    /**
     * created date of a character
     */
    @Column(name = "created", nullable = false)
    private String created;

}


