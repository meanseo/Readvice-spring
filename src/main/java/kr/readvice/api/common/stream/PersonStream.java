package kr.readvice.api.common.stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: kr.readvice.api.common.stream
 * fileName        : PersonStream
 * author           : 최민서
 * date               : 2022-05-16
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-16         최민서        최초 생성
 */

public class PersonStream {
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    public static class Person{
        private String name, ssn;
        @Override
        public String toString(){
            String gender = (ssn.substring(7,8).equals("1")||ssn.substring(7,8).equals("3"))? "남자":"여자";

            String year = (ssn.substring(7,8).equals("1")||ssn.substring(7,8).equals("2"))? "19"+ ssn.substring(0,2) : "20"+ ssn.substring(0,2);
            int age = 2022 - Integer.parseInt(year) + 1;

            return String.format("name: %s, gender: %s, age: %d", name, gender, age);
        }
    }
    interface  PersonService{
        Person search(List<Person> arr);
    }
    static class PersonServiceImpl implements PersonService{

        @Override
        public Person search(List<Person> arr) {
            return arr.stream()
                    .filter(e -> e.getName().equals("유관순"))
                    .collect(Collectors.toList()).get(0);
        }
    }
    @Test
    void personStreamTest(){
        List<Person> arr = Arrays.asList(
                Person.builder().name("홍길동").ssn("900120-1").build(),
                Person.builder().name("김유신").ssn("970620-1").build(),
                Person.builder().name("유관순").ssn("040920-4").build()
        );
        System.out.println(new PersonServiceImpl()
                .search(arr));
    }
}
