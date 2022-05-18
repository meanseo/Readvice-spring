package kr.readvice.api.common.algo01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * packageName: kr.readvice.api.common.algo01
 * fileName        : RemoveDuplicateElementsArray
 * author           : 최민서
 * date               : 2022-05-17
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-17         최민서        최초 생성
 */

public class RemoveDuplicateElementsArray {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    private static class Solution{
        int[] arr;
        @Override
        public String toString() {
            int[] newArr ={};
            return String.format("새로운 배열: "+ newArr);
        }
    }
    @FunctionalInterface private interface SolutionService{
        Solution solution(Solution s);
    }
    @Test void solutionTest(){
        int [] arr = {5,10,9,27,2,8,10,4,27,1};
        //SolutionService f = e -> ;
        Solution s = Solution.builder().arr(arr).build();
        //System.out.println(f.solution(s));

    }
}
