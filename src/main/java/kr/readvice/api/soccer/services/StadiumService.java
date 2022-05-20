package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.domains.Schedule;
import kr.readvice.api.soccer.domains.Stadium;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.services
 * fileName        : StadiumService
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
public interface StadiumService {
    void save(Stadium stadium);
    void delete(Stadium stadium);
    List<Stadium> findAll();
    List<Stadium> findAll(Sort sort);
    Page<Stadium> findAll(Pageable pageable);
    long count();
}
