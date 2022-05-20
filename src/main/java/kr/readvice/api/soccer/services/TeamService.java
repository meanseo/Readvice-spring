package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.domains.Stadium;
import kr.readvice.api.soccer.domains.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.services
 * fileName        : TeamService
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
public interface TeamService {
    void save(Team team);
    void delete(Team team);
    List<Team> findAll();
    List<Team> findAll(Sort sort);
    Page<Team> findAll(Pageable pageable);
    long count();
}
