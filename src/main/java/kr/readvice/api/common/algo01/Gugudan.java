package kr.readvice.api.common.algo01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import javax.persistence.Access;

/**
 * packageName: kr.readvice.api.common.algo01
 * fileName        : Gugudan
 * author           : 최민서
 * date               : 2022-05-17
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         최민서        최초 생성
 * 2022-05-19         김진영        구구단 풀이 추가
 * 2022-05-19         조현국        구구단 풀이 추가 2
 */

public class Gugudan {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    private static class Solution{
        int i,j;

        @Override
        public String toString() {
            return String.format("");
        }
    }

    @FunctionalInterface
    private interface ISolution {
        String solution();
    }

    @Test
    void test() {
//        ISolution s = () ->{};
//        s.solution();
    }
}
