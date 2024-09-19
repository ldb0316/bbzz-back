package com.bbzz_back.bbs.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BbsDTO {

    private Integer bbsNo;

    private String bbsType;

    private String bbsTitle;

    private String bbsCn;

    private String bbsTags;

    private Long bbsViews = 0L;

    private Long bbsLikes = 0L;

    private Long bbsDislikes = 0L;

    private String deleteAt;

    private String registerId;

    private String registerNickname;

    private LocalDateTime regDt;

    private String correctorId;

    private LocalDateTime correctionDt;

}
