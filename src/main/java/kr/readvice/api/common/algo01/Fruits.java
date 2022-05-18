package kr.readvice.api.common.algo01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

/**
* packageName: kr.readvice.api.common.algo01
* fileName        : Fruits
* author           : 최민서
* date               : 2022-05-17
* ================================
*  DATE              AUTHOR        NOTE
* ================================
*  2022-05-17         최민서        최초 생성
*/

public class Fruits {
    @Builder
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Solution {
        private int[][] arr;
        private int apple, grape, orange;

        @Override
        public String toString() {
            int total = apple + grape + orange;
            int appleAvg = apple;
            int grapeAvg = grape;
            int orangeAvg = orange;

            return String.format("총합: %d, 사과 평균: %d, 포도 평균: %d, 오렌지 평균: %d", total, appleAvg, grapeAvg, orangeAvg);
        }
    }

    @FunctionalInterface
    private interface ISolution {
        Solution solution(int[][] s);
    }

    @Test
    void SolutionTest() {
        int[][] arr = {{10000, 20000, 12000},
                {8000, 3000, 15000},
                {20000, 15000, 38000},
                {13000, 20000, 30000},
                {30000, 12000, 20000},
                {35000, 30000, 25000},
                {50000, 23000, 10000}};
        ISolution f = e -> {
            int apple = 0;
            int grape = 0;
            int orange = 0;
            int total = 0;
            for (int i = 0; i < e.length; i++) {
                for (int j = 0; j < e[i].length; j++) {
                    if (j == 0) apple += e[i][j];
                    if (j == 1) grape += e[i][j];
                    if (j == 2) orange += e[i][j];
                }

            }
            return Solution.builder().apple(apple).grape(grape).orange(orange).build();
        };
        Solution s = Solution.builder().arr(arr).build();
        System.out.println(f.solution(s.arr));
    }
}

