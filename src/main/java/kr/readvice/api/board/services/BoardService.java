package kr.readvice.api.board.services;

import kr.readvice.api.board.domains.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.readvice.api.board.services
 * fileName        : BoardService
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
public interface BoardService {
    void save(Board board);
    void delete(Board board);
    List<Board> findAll();
    List<Board> findAll(Sort sort);
    Page<Board> findAll(Pageable pageable);
    long count();
}
