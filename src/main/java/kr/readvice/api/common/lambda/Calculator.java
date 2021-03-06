package kr.readvice.api.common.lambda;

import org.junit.jupiter.api.Test;

/**
 * packageName: kr.readvice.api.common.lambda
 * fileName        : Calculator
 * author           : 최민서
 * date               : 2022-05-11
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         최민서        최초 생성
 */

public class Calculator {
    interface Arithmetic{
        int operation(int a, int b);
    }
    private int operate(int a, int b, Arithmetic arith){
        return arith.operation(a, b);
    }
    @Test void calcAppTest(){
        var s = "계산기";
        System.out.println(s);
        Calculator c = new Calculator();
        System.out.println("10 + 5 = " + c.operate(10, 5, (a,b)->a+b));
        System.out.println("10 - 5 = " + c.operate(10, 5, (a,b)->a-b));
        System.out.println("10 x 5 = " + c.operate(10, 5, (a, b)->a*b));
        System.out.println("10 / 5 = " + c.operate(10, 5, (a,b)->a/b));
    }
}
