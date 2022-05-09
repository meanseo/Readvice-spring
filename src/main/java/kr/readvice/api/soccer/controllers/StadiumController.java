package kr.readvice.api.soccer.controllers;

import kr.readvice.api.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.readvice.api.soccer.controllers
 * fileName        : StadiumController
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
public class StadiumController {
    final private StadiumService service;
}
