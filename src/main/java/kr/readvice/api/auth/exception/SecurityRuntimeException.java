package kr.readvice.api.auth.exception;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * packageName: kr.readvice.api.auth.exception
 * fileName        : SecurityRuntimeException
 * author           : 최민서
 * date               : 2022-05-24
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-24         최민서        최초 생성
 */

@Getter
@RequiredArgsConstructor
public class SecurityRuntimeException extends RuntimeException{
    private static final long SerializableUID = 1L;

    private final String msg;
    private final HttpStatus httpStatus;
}
