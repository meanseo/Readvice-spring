package kr.readvice.api.soccer.controllers;

import kr.readvice.api.soccer.domains.Schedule;
import kr.readvice.api.soccer.domains.Stadium;
import kr.readvice.api.soccer.services.StadiumService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.controllers
 * fileName        : StadiumController
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/stadiums")
public class StadiumController {
    final private StadiumService service;

    @PostMapping("/join")
    public void save(@RequestBody Stadium stadium) {
        service.save(stadium);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Stadium stadium) {
        service.delete(stadium);
    }
    @GetMapping("/findAll")
    public List<Stadium> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Stadium> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Stadium> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }
}
