package com.project.mything.member.dto;

import lombok.Data;

@Data
public class InfoUpdateRequestDto {
    private String nickname;
    private String imagePath;
    private String birth;
    private String gender;

}
