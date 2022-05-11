package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName: kr.readvice.api.common.dataStructure
 * fileName        : AppleList
 * author           : 최민서
 * date               : 2022-05-11
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         최민서        최초 생성
 */

// Apple color price
public class AppleList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("0.exit 1.save 2.update 3.delete 4.findByName 5.findAll 6.count 7.clear");
            switch (s.next()) {
                case "0": return;
                case "1": break;
                case "2": break;
                case "3": break;
                case "4": break;
                case "5": break;
                case "6": break;
                case "7": break;
                default:break;

            }
        }

    }
    @Data static class Apple{
        protected String color, origin;
        protected int price;

        public Apple(Builder builder) {
            this.color = builder.color;
            this.origin = builder.origin;
            this.price = builder.price;
        }

        @NoArgsConstructor static class Builder{
            private String color, origin;
            private int price;
            public Builder color(String color){this.color=color; return this;}
            public Builder origin(String origin){this.origin=origin; return this;}
            public Builder price(int price){this.price=price; return this;}
            Apple build(){ return  new Apple(this);}

        }
    }
    interface AppleService{
        void save(Apple apple);
        void update(Apple apple);
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
        public void update(Apple apple) {

        }

        @Override
        public void delete(Apple apple) {
            list.remove(apple);
        }

        @Override
        public List<Apple> findAll() {
            return null;
        }

        @Override
        public List<Apple> findByOrigin(String origin) {
            return null;
        }

        @Override
        public List<Apple> findByColor(String color) {
            return null;
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
            list.clear();
        }
    }
}
