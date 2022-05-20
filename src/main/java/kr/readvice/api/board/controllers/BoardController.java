package kr.readvice.api.board.controllers;

import kr.readvice.api.board.domains.Article;
import kr.readvice.api.board.domains.Board;
import kr.readvice.api.board.services.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/boards")
public class BoardController {
    final private BoardService service;

    @GetMapping("/findAll")
    public List<Board> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Board> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Board> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Board board) {
         service.delete(board);
    }

    @PostMapping("/join")
    public void save(@RequestBody Board board) {
        service.save(board);
    }
}