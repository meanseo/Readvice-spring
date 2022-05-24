package kr.readvice.api.auth.domains;

import com.sun.istack.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import java.util.List;

/**
 * packageName: kr.readvice.api.auth.domains
 * fileName        : UserDto
 * author           : 최민서
 * date               : 2022-05-24
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-24         최민서        최초 생성
 */

@Component
@Data
public class UserDto {
    @ApiModelProperty(position = 0) private long userId;
    @ApiModelProperty(position = 1) String username;
    @ApiModelProperty(position = 2) String password;
    @ApiModelProperty(position = 3) String name;
    @ApiModelProperty(position = 4) String email;
    @ApiModelProperty(position = 5) private String regDate;
    @ApiModelProperty(position = 6) private String token;
    @ApiModelProperty(position = 7) private List<Role> roles;
}
