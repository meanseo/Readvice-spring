package kr.readvice.api.board.services;

import kr.readvice.api.board.domains.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.readvice.api.board.services
 * fileName        : ArticleService
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
public interface ArticleService {

    List<Article> findAll();
    List<Article> findAll(Sort sort);
    Page<Article> findAll(Pageable pageable);

    long count();

    String delete(Article article);

    String save(Article article);

}
