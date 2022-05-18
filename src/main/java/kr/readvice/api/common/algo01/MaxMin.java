package kr.readvice.api.common.algo01;

import kr.readvice.api.common.stream.PersonStream;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * packageName: kr.readvice.api.common.algo01
 * fileName        : MaxMin
 * author           : 최민서
 * date               : 2022-05-17
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         최민서        최초 생성
 */

public class MaxMin {
    @Builder @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Solution {
        private int[] arr;
        private int max, min, elem;

        @Override
        public String toString() {
            return String.format("최소값: %d, 최대값: %d",min,max);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }

    @Test void MaxMinTest(){
        int[] arr = {3,1,9,5,10};
        SolutionService f = e ->{
            int max = 0;
            for(int i : e.getArr()){
                if(i > max) max = i;
            }
            int min = max;
            for(int i : e.getArr()){
                if(i < min) min = i;
            }
            /**
            int max = 0;
            int min = 10;
            for(int i : e.getArr()){
                if(i > max) max = i;
                if(i < min) min = i;
            }*/
            return Solution.builder().min(min).max(max).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s));
    }
}
