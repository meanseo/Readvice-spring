package kr.readvice.api.common.algo01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * packageName: kr.readvice.api.common.algo01
 * fileName        : CheckSameArray
 * author           : 최민서
 * date               : 2022-05-17
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         최민서        최초 생성
 */

public class CheckSameArray {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Solution {
        int[] arr1, arr2;
        String res;

        @Override
        public String toString() {
            return String.format("두 배열은 %s", res);
        }
    }

    @FunctionalInterface
    private interface ISolution {
        Solution solution(int[] arr1, int[] arr2);
    }

    @Test
    void test() {
        int[] arr1 = {1,3,2};
        int[] arr2 = {2,3,1};
        ISolution f = (x, y)-> {
            boolean d = false;
            String res = "";
            for (int i = 0 ; i < x.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    if (x[i]==y[j]) {
                        d = true;
                        break;
                    }
                }
        }
            return Solution.builder().res(res).build();
    };
        System.out.println(f.solution(arr1, arr2));
    }
}
