package kr.readvice.api.soccer.repositories;

import kr.readvice.api.soccer.domains.Player;
import kr.readvice.api.soccer.domains.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: kr.readvice.api.soccer.repositories
 * fileName        : ScheduleRepository
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */

//interface ScheduleCustomRepository{
//
//}

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

}
