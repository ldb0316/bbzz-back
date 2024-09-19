package com.bbzz_back.bbs.service;

import com.bbzz_back.bbs.dto.BbsDTO;
import com.bbzz_back.bbs.entiry.Bbs;
import com.bbzz_back.bbs.repository.BbsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BbsService {

    private final BbsRepository bbsRepository;

    public List<Bbs> selectAllByBbsType(String bbsType) {
        return bbsRepository.findAllByBbsType(bbsType);
    }
}
