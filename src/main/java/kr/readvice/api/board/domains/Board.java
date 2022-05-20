package kr.readvice.api.board.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName: kr.readvice.api.auth.domains
 * fileName        : Board
 * author           : 최민서
 * date               : 2022-05-18
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-18         최민서        최초 생성
 */
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Component
@Table(name = "boards")
public class Board {
    @Id
    @Column(name = "board_id")
    @GeneratedValue private long userId;
    @Column private @NotNull String boardname;
    @Column(name = "created_date") @NotNull private String createdDate;

    @OneToMany(mappedBy = "board")
    List<Article> articles = new ArrayList<>();
}
