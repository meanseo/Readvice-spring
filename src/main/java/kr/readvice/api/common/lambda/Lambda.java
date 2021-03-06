package kr.readvice.api.common.lambda;


import org.junit.jupiter.api.Test;

import static kr.readvice.api.common.dataStructure.AppleList.Apple;

import java.io.File;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.function.*;

/**
 * packageName: kr.readvice.api.common.lambda
 * fileName        : LambdaUtil
 * author           : 최민서
 * date               : 2022-05-11
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         최민서        최초 생성
 */

public class Lambda {
    public static int integer(String s){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(s);
    }
    public static long longParse(String s){
        Function<String, Long> f = Long::parseLong;
        return f.apply(s);
    }
    public static float floatParse(String s){
        Function<String, Float> f = Float::parseFloat;
        return f.apply(s);
    }
    public static String string(Object o){
        Function<Object, String> f = String::valueOf;
        // String s = String.valueOf(Object)
        return f.apply(o);
    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String> f = String::equals;
        return f.test(s1, s2);
    }
    // int[] arr = new int[8]
    // = int[]::new
    public static int[] array(int i){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(i);
    }
    public static int random(int s, int e){
       BiFunction<Integer, Integer, Integer> f = (t, u)-> (int)(Math.random()*u)+t;
       return f.apply(s,e);
    }
    //
    public static File makeFile(String s){
        Function<String, File> f = File::new;
        return f.apply(s);
    }

    public static String date(){
        Supplier<String> f = ()-> string(LocalDate.now());
        return f.get();
    }

    @Test void lambdaAppTest(){// System.out.println(integer("900"));
        /**
         System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
         System.out.println(
         string(
         Arrays.asList(
         new Apple.Builder().origin("영동").color("RED").price(1000).build(),
         new Apple.Builder().origin("영동").color("BLUE").price(2000).build(),
         new Apple.Builder().origin("풍기").color("BLUE").price(3000).build()
         )
         )
         );
         System.out.println(array(5).length); */
        // System.out.println(random2(1,6));
    }
}