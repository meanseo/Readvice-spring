package kr.readvice.api.soccer.services;

import kr.readvice.api.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
public class TeamServiceImpl {
    private final TeamRepository repository;
}
