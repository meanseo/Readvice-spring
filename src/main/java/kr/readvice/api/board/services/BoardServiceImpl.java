package kr.readvice.api.board.services;

import kr.readvice.api.board.domains.Board;
import kr.readvice.api.board.repositories.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName: kr.readvice.api.board.services
 * fileName        : BoardServiceImpl
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{
    private final BoardRepository repository;

    @Override
    public void save(Board board) {
        repository.save(board);
    }

    @Override
    public void delete(Board board) {
        repository.delete(board);
    }

    @Override
    public List<Board> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
