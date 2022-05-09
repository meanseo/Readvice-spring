package kr.readvice.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName: kr.readvice.api.soccer.domains
 * fileName        : Player
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
@Table(name = "palyer")
public class Player {
    @Id private Long id;
    @Column(nullable = false) private String playerId;
    private String playerName;
    @Column(nullable = false) private String teamId;
    private String nickName;
    private String joinYyyy;
    private String position;
    private String backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;
}
