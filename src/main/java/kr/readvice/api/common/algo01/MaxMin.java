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
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class MinMaxValue {
        private int[] arr;

        @Override
        public String toString() {
            int min = 0;
            int max = 0;
            return String.format("최소값: %d, 최대값: %d",min,max);
        }
    }
    interface MaxMinService{
        int getMin(int[] arr);
        int getMax(int[] arr);
    }
    public class MaxMinServiceImpl implements MaxMinService{
        @Override
        public int getMin(int[] arr) {
            int min = 0;
            for(int i =1; i<5; i++){
                if(arr[i] < arr[0]){ min = arr[i];}
            }
            return min;
        }

        @Override
        public int getMax(int[] arr) {
            int max = 0;
            for(int i =1; i<5; i++){
                if(arr[i] > arr[0]){ max = arr[i];}
            }
            return max;
        }
    }
    @Test void MaxMinTest(){}

}
