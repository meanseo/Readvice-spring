package kr.readvice.api.board.controllers;

import kr.readvice.api.board.domains.Article2;
import kr.readvice.api.board.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName: kr.readvice.api.board.controllers
 * fileName        : ArticleController
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class ArticleController {
    private final ArticleService service;

    @GetMapping("/findAll")
    public List<Article2> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Article2> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Article2> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Article2 article) {
        return service.delete(article);
    }

    @PostMapping("/join")
    public String save(@RequestBody Article2 article) {
        return service.save(article);
    }

}
