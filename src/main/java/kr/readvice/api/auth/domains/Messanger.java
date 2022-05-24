package kr.readvice.api.auth.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName: kr.readvice.api.security.domains
 * fileName        : Messanger
 * author           : 최민서
 * date               : 2022-05-23
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-23         최민서        최초 생성
 */
@Getter @Builder
public class Messanger {
    private String message, code;
    private int status;
}
