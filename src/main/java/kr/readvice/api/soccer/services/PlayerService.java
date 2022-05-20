package kr.readvice.api.soccer.services;

import kr.readvice.api.auth.domains.User;
import kr.readvice.api.board.domains.Article2;
import kr.readvice.api.soccer.domains.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.readvice.api.soccer.services
 * fileName        : PlayerService
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
public interface PlayerService {

    void save(Player player);
    void delete(Player player);
    List<Player> findAll();
    List<Player> findAll(Sort sort);
    Page<Player> findAll(Pageable pageable);
    long count();
}
