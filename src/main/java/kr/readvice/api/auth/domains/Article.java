package kr.readvice.api.auth.domains;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: kr.readvice.api.auth.domains
 * fileName        : Article
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
@Table(name="articles")
public class Article {
    @Id @Column(name = "article_id")
    @GeneratedValue private long articleId;
    @Column @NotNull private String title;
    @Column @NotNull private String content;
    @Column(name = "written_date") @NotNull private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
}
