package kr.readvice.api.soccer.repositories;

import kr.readvice.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.readvice.api.soccer.repositories
 * fileName        : StadiumRepository
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */

interface StadiumCustomRepository{
    // 000. 스타디움 전화번호 tel 을 변경하도록 하시오.
    @Query(value="update stadium s set s.tel = :tel where s.stadiumNo = :stadiumNo",
            nativeQuery = true)
    void update(@Param("tel") String tel, @Param("stadiumNo") String stadiumNo);
}

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> , StadiumCustomRepository {

}
