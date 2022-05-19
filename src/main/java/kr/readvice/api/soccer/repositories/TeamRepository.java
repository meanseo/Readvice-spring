package kr.readvice.api.soccer.repositories;

import kr.readvice.api.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.readvice.api.soccer.repositories
 * fileName        : Teamrepositories
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */

interface TeamCustomRepository{

}

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}
