package kr.readvice.api.board.controllers;

import kr.readvice.api.board.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: kr.readvice.api.board.controllers
 * fileName        : CommentController
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
public class CommentController {
    final private CommentService service;
}
