package kr.readvice.api.soccer.controllers;

import kr.readvice.api.soccer.domains.Player;
import kr.readvice.api.soccer.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.controllers
 * fileName        : PlayerController
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/players")
public class PlayerController {
    final private PlayerService service;

    @PostMapping("/join")
    public void save(@RequestBody Player player) {
        service.save(player);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Player player) {
        service.delete(player);
    }
    @GetMapping("/findAll")
    public List<Player> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Player> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Player> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

}
