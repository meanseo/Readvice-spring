package kr.readvice.api.common.algo01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * packageName: kr.readvice.api.common.algo01
 * fileName        : PrimeNumber
 * author           : 최민서
 * date               : 2022-05-17
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         최민서        최초 생성
 */

public class PrimeNumber {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    private static class Solution{
        int start, end;
        List<Integer> prime;

        @Override
        public String toString() {
            return String.format("소수: %s" + prime.toString());
        }
    }
    @FunctionalInterface private interface SolutionService{
        List<Integer> solution(int s, int e);
    }
    @Test void testSolution() {
//        SolutionService s = (x, y) -> {
//            int count=0;
//            String[] arr;
//            for(int i = x; i <= y; x++ ){
//                for(int j=2; j<= i; j++){
//                    if(i%j==0) count++;
//                }
//                if(count ==1) ;
//            }
//            count = 0;
//            // return Solution.builder().prime().build();
//        };

        // System.out.println(s.solution(1,100));
    }
}
