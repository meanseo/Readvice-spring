package kr.readvice.api.soccer.controllers;

import kr.readvice.api.soccer.domains.Player;
import kr.readvice.api.soccer.domains.Schedule;
import kr.readvice.api.soccer.services.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName: kr.readvice.api.soccer.controllers
 * fileName        : ScheduleController
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/schedules")
public class ScheduleController {
    final private ScheduleService service;

    @PostMapping("/join")
    public void save(@RequestBody Schedule schedule) {
        service.save(schedule);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Schedule schedule) {
        service.delete(schedule);
    }
    @GetMapping("/findAll")
    public List<Schedule> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Schedule> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Schedule> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }
}
