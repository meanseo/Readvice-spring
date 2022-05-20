package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.domains.Player;
import kr.readvice.api.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.services
 * fileName        : ScheduleService
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
public interface ScheduleService {
    void save(Schedule schedule);
    void delete(Schedule schedule);
    List<Schedule> findAll();
    List<Schedule> findAll(Sort sort);
    Page<Schedule> findAll(Pageable pageable);
    long count();
}
