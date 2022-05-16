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
        Set<Hello> greet(List<Hello> arr);
    }
    static class HelloServiceImpl implements HelloService {

        @Override
        public Set<Hello> greet(List<Hello> arr){
            return arr
                    .stream()
                    .filter(e -> e.getInLanguage().equals("영어"))
                    .collect(Collectors.toSet());
        }
    }
    @Test void helloTest(){
        List<Hello> arr = Arrays.asList(
                Hello.builder().inLanguage("영어").greeting("hello").build(),
                Hello.builder().inLanguage("한국어").greeting("안녕").build()
        );
        new HelloServiceImpl()
                .greet(arr)
                .forEach(System.out::print);
    }
}


