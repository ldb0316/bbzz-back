package com.bbzz_back.bbs.repository;

import com.bbzz_back.bbs.dto.BbsDTO;
import com.bbzz_back.bbs.entiry.Bbs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BbsRepository extends JpaRepository<Bbs, String> {

    List<Bbs> findAllByBbsType(String bbsType);

}
