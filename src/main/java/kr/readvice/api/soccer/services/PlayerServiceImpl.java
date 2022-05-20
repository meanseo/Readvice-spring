package kr.readvice.api.soccer.services;

import kr.readvice.api.auth.domains.User;
import kr.readvice.api.soccer.domains.Player;
import kr.readvice.api.soccer.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: kr.readvice.api.soccer.services
 * fileName        : PlayerServiceImpl
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService{
    private final PlayerRepository repository;

    @Override
    public void save(Player player) {
        repository.save(player);
    }

    @Override
    public void delete(Player player) {repository.delete(player);}

    @Override
    public void update(Player player) {

    }

    @Override
    public List<Player> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Player> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Player> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
