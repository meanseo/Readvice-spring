package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.domains.Team;
import kr.readvice.api.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.services
 * fileName        : TeamServiceImpl
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService{
    private final TeamRepository repository;

    @Override
    public void save(Team team) {
        repository.save(team);
    }

    @Override
    public void delete(Team team) {
        repository.delete(team);
    }

    @Override
    public void update(Team team) {
        repository.update(team);
    }

    @Override
    public List<Team> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Team> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Team> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
