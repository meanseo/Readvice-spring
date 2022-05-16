package kr.readvice.api.common.dataStructure;

import static kr.readvice.api.common.lambda.Lambda.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * packageName: kr.readvice.api.common.dataStructure
 * fileName        : AppleList
 * author           : 최민서
 * date               : 2022-05-11
 * =====================================
 * DATE              AUTHOR        NOTE
 * =====================================
 * 2022-05-11         최민서        최초 생성
 */

// Apple color price origin
public class AppleList {
    @Data
    public static class Apple{
        protected String color, origin;
        protected int price;

        public Apple(Builder builder) {
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;
        }

        @NoArgsConstructor public static class Builder{
            private String color, origin;
            private int price;
            public Builder color(String color){this.color=color; return this;}
            public Builder origin(String origin){this.origin=origin; return this;}
            public Builder price(int price){this.price=price; return this;}
            public Apple build(){ return  new Apple(this);}
        }
        @Override public String toString(){
            return String.format("[사과 스펙] origin: %s, color: %s, price: %d",
                    origin, color, price);
        }
    }
    interface AppleService{
        void save(Apple apple);
        void update(int i, Apple apple);
        void delete(Apple apple);
        List<Apple> findAll();
        List<Apple> findByOrigin(String origin);
        List<Apple> findByColor(String color);
        Apple findById (int i);
        int count();
        void clear();
    }
    static class AppleServiceImpl implements AppleService{
        private final List<Apple> list;

        public AppleServiceImpl(){this.list = new ArrayList<>();}

        @Override
        public void save(Apple apple) {
            list.add(apple);
        }

        @Override
        public void update(int i, Apple apple) {
            list.set(i, apple);
        }

        @Override
        public void delete(Apple apple) {
            list.remove(apple);
        }

        @Override
        public List<Apple> findAll() {
            return list;
        }

        @Override
        public List<Apple> findByOrigin(String origin) {
            return list.stream()
                    .filter(apple -> apple.getOrigin().equals(origin))
                            .collect(Collectors.toList());
        }

        @Override
        public List<Apple> findByColor(String color) {
            return list.stream()
                    .filter(apple -> apple.getColor().equals(color))
                    .collect(Collectors.toList());
        }

        @Override
        public Apple findById(int i) {
            return list.get(i);
        }

        @Override
        public int count() {
            return list.size();
        }

        @Override
        public void clear() {
            list.clear(); // 민서 하이
        }
    }
    static List<Apple> filterApples(List<Apple> list, Predicate<Apple> p){
        List<Apple> res = new ArrayList<>();
        for (Apple apple:list){
            if(p.test(apple)){
                res.add(apple);
            }
        }
        return res;
    }
    @Test void appleAppTest(){
        AppleService service = new AppleServiceImpl();
                    Apple yd = new Apple.Builder()
                            .origin("영동")
                            .color("RED")
                            .price(1000)
                            .build();
                    service.save(yd);
                    Apple yd2 = new Apple.Builder()
                            .origin("영동")
                            .color("BLUE")
                            .price(1500)
                            .build();
                    service.save(yd2);
                    Apple pg = new Apple.Builder()
                            .origin("풍기")
                            .color("RED")
                            .price(2000)
                            .build();
                    service.save(pg);
                    System.out.println("5.findByOrigin");
                    System.out.println(service.findByOrigin("영동"));

                    System.out.println("6.findByColor");
                    System.out.println(service.findByColor("RED"));

                    System.out.println("사과 가격은 "+ integer("1000"));
                    System.out.println("내가 만든 배열 사이즈: "+ array(7).length);

    }
}
