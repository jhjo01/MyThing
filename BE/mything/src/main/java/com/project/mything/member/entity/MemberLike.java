package com.project.mything.member.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "member_like")
public class MemberLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_like_id")
    private Long id;

    @Column(name = "member_like_image")
    private String likeImage;

    private LocalDateTime time;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kakao_id")
    @JsonIgnore
    private Member member;
}
