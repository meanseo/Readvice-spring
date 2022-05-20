package kr.readvice.api.soccer.controllers;

import kr.readvice.api.soccer.domains.Stadium;
import kr.readvice.api.soccer.domains.Team;
import kr.readvice.api.soccer.services.StadiumService;
import kr.readvice.api.soccer.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.controllers
 * fileName        : TeamController
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/teams")
public class TeamController {
    final private TeamService service;

    @PostMapping("/join")
    public void save(@RequestBody Team team) {
        service.save(team);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Team team) {
        service.delete(team);
    }
    @GetMapping("/findAll")
    public List<Team> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Team> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Team> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }
}
