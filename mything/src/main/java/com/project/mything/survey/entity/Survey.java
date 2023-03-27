package com.project.mything.survey.entity;

import javax.persistence.*;

@Entity
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id")
    private Long id;

    @Column(name = "image_name")
    private String name;

    @Column(name = "option_image")
    private String image;

}
