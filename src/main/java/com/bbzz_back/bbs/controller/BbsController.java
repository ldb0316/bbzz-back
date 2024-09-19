package com.bbzz_back.bbs.controller;

import com.bbzz_back.bbs.entiry.Bbs;
import com.bbzz_back.bbs.service.BbsService;
import com.bbzz_back.common.response.CmmResponse;
import com.bbzz_back.common.response.CmmResponseBody;
import com.bbzz_back.common.response.HttpStatusMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor //Service에 생성자 주입 방식으로 의존성 주입받기위해 추가
@RequestMapping("/bbs")
public class BbsController {

    private final BbsService bbsService;

    @GetMapping("/{bbsType}")
    public ResponseEntity<CmmResponseBody> getHomeInfo(@PathVariable String bbsType) {

        List<Bbs> resultList = bbsService.selectAllByBbsType(bbsType);

        return CmmResponse.builder()
                .status(HttpStatusMessage.OK) //개발 과정에서 status만 컨트롤하면 자동으로 메세징 처리 되도록 구성
                .resultData(resultList)
                .build()
                .getEntity();
    }
}
