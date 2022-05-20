package kr.readvice.api.soccer.repositories;

import kr.readvice.api.soccer.domains.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    // 000. 팀의 전화번호와 팩스 번호를 수정하시오.
    @Query(value = "update team t set t.tel = :tel, t.fax = :fax where t.teamNo = :teamNo",
            nativeQuery = true)
    int update(@Param("tel") String tel, @Param("fax") String fax, @Param("teamNo") String teamNo);
    // 001. 전체 축구팀 목록을 팀이름 오름차순으로 출력하시오.
    @Query(value = "select t.teamName as teamname from team t order by t.teamName asc",
            nativeQuery = true)
    List<String> findTeamNamesAsc();
}
@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{
    void update(Team team);
}
