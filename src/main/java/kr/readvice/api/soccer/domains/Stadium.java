package kr.readvice.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName: kr.readvice.api.soccer.domains
 * fileName        : Stadium
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
@Table(name = "stadium")
public class Stadium {
    @Id private Long id;
    @Column(nullable = false) private String stadiumId;
    private String stadiumName;
    private String hometeamId;
    private int seatCount;
    private String address;
    private String ddd;
    private String tel;
}
