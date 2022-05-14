package kr.readvice.api.common.lambda;

/**
 * packageName: kr.readvice.api.common.lambda
 * fileName        : MyLambda
 * author           : 최민서
 * date               : 2022-05-13
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-13         최민서        최초 생성
 */

public class MyLambda {
    @FunctionalInterface interface MyFunction{int execute(String arg);}
    @FunctionalInterface interface MyConsumer{void execute(String arg);}
    @FunctionalInterface interface MySupplier{int execute();}
    @FunctionalInterface interface MyPredicate{boolean execute(String arg);}
    @FunctionalInterface interface MyInterface{String myMethod();}
    @FunctionalInterface interface MyUnaryOp{int operator(Integer a);}
    @FunctionalInterface interface LengthOfString{int execute(int a, int b);}
}

