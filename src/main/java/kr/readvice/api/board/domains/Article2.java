package kr.readvice.api.board.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.readvice.api.board.domains
 * fileName        : Article
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
@Table(name = "articles")
public class Article2 {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) private String projects;
    @Column(nullable = false) private String startDate;
    @Column(nullable = false) private String status;
    @Column(nullable = false) private String team;
    @Column(nullable = false) private String progress;
    @Column(nullable = false) private Boolean action;

}
