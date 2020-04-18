package com.rogerlester.app.tech;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Tech {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    private String layer;
    private String language;

    public Tech() {}

    public Tech(String name, String description, String layer, String language) {
        this.name = name;
        this.description = description;
        this.layer = layer;
        this.language = language;
    }
}
