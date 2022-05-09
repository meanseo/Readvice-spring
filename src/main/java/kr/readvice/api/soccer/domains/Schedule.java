package kr.readvice.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName: kr.readvice.api.soccer.domains
 * fileName        : Schedule
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
@Data
@Component
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id private Long id;
    @Column(nullable = false) private String stadiuImd;
    private String scheDate;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private int homeScore;
    private int awayScore;

}