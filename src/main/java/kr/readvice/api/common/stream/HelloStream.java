package kr.readvice.api.common.stream;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.startsWith;

/**
 * packageName: kr.readvice.api.common.stream
 * fileName        : HelloStream
 * author           : 최민서
 * date               : 2022-05-16
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-16         최민서        최초 생성
 */
// 한국어 안녕, 영어 Hello
public class HelloStream {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Hello {
        private String greeting, inLanguage;
        @Override
        public String toString() {
            return String.format(" 인사 : %s, %s", inLanguage,greeting);
        }
    }
    interface HelloService {
        Set<String> greet(String[] arr);
    }
    static class HelloServiceImpl implements HelloService {

        @Override
        public Set<String> greet(String[] arr){
            return Arrays.asList(arr)
                    .stream()
                    .filter(e -> e.startsWith("한국어"))
                    .collect(Collectors.toSet());
        }
    }
    @Test void helloTest(){
        HelloService service = new HelloServiceImpl();
        String[] arr = {"한국어 안녕", "영어 Hello"};
        Set<String> res = service.greet(arr);
        res.forEach(System.out::print);
    }
}


