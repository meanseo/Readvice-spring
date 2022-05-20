package kr.readvice.api.soccer.repositories;

import kr.readvice.api.auth.domains.User;
import kr.readvice.api.soccer.domains.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
interface PlayerCustomRepository{
    // 000. 선수들의 키와 몸무게를 변경하시오.
    @Query(value = "update player p set p.height = : height, p.weight = :weight where p.playerNo = :playerNo",
            nativeQuery = true)
    void update(@Param("height") String height, @Param("weight") String weight, @Param("playerNo") String playerNo);
}


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
