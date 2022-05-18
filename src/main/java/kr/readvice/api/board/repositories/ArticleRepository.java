package kr.readvice.api.board.repositories;

import kr.readvice.api.board.domains.Article2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.readvice.api.board.repositories
 * fileName        : ArticleRepository
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article2, Long> {
}
