package kr.readvice.api.board.repositories;

import kr.readvice.api.board.domains.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.readvice.api.board.repositories
 * fileName        : BoardRepository
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
