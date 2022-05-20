package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.domains.Stadium;
import kr.readvice.api.soccer.repositories.ScheduleRepository;
import kr.readvice.api.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.services
 * fileName        : StadiumServiceImpl
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService {
    private final StadiumRepository repository;

    @Override
    public void save(Stadium stadium) {
        repository.save(stadium);
    }

    @Override
    public void delete(Stadium stadium) {
        repository.delete(stadium);
    }

    @Override
    public List<Stadium> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Stadium> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Stadium> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
