package kr.readvice.api.soccer.repositories;

import kr.readvice.api.auth.domains.User;
import kr.readvice.api.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.readvice.api.soccer.repositories
 * fileName        : playerRepository
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
//interface PlayerCustomRepository{
//    void update(Player player);
//}


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
