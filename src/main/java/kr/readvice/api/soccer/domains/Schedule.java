package kr.readvice.api.soccer.domains;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

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
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "schedules")
public class Schedule {
    @Id
    @Column(name = "schedule_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long scheduleNo;
    private String scheDate;
    private String stadiumId;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private String homeScore;
    private String awayScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_no")
    private Stadium stadium;
}