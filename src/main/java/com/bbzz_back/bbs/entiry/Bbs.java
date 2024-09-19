package com.bbzz_back.bbs.entiry;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "bbs")
public class Bbs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bbs_no")
    private Integer bbsNo;

    @Column(name = "bbs_type", length = 6, nullable = false)
    private String bbsType;

    @Column(name = "bbs_title", length = 100)
    private String bbsTitle;

    @Column(name = "bbs_cn", columnDefinition = "TEXT")
    private String bbsCn;

    @Column(name = "bbs_tags", columnDefinition = "TEXT")
    private String bbsTags;

    @Column(name = "bbs_views", nullable = false)
    private Long bbsViews = 0L;

    @Column(name = "bbs_likes", nullable = false)
    private Long bbsLikes = 0L;

    @Column(name = "bbs_dislikes", nullable = false)
    private Long bbsDislikes = 0L;

    @Column(name = "delete_at", length = 1, nullable = false)
    private String deleteAt;

    @Column(name = "register_id", length = 50, nullable = false)
    private String registerId;

    @Column(name = "register_nickname", length = 50, nullable = false)
    private String registerNickname;

    @Column(name = "reg_dt", nullable = false)
    private LocalDateTime regDt;

    @Column(name = "corrector_id", length = 50)
    private String correctorId;

    @Column(name = "correction_dt")
    private LocalDateTime correctionDt;

}