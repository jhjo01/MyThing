package com.project.mything.review.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "review_image")
public class ReviewImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_image_id")
    private Long id;

    private String image;

    @NotNull
    @Column(name = "like_cnt")
    private Long likeCnt;

    @OneToOne(mappedBy = "reviewImage", fetch = FetchType.LAZY)
    @JsonIgnore
    private Review review;
}
