package kr.readvice.api.soccer.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * packageName: kr.readvice.api.soccer.domains
 * fileName        : Team
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
@Table(name = "team")
public class Team {
    @Id private Long id;
    @Column(nullable = false) private String teamId;
    private String regionName;
    private String teamName;
    private String eTeamName;
    private String origYyyy;
    @Column(nullable = false) private String stadiumId;
    private String zipCode1;
    private String zipCode2;
    private String address;
    private String ddd;
    private String tel;
    private String fax;
    private String hompage;
    private String teamOwner;
}
