package kr.readvice.api.common.dataStructure;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * packageName: kr.readvice.api.common.dataStructure
 * fileName        : BmiList
 * author           : 최민서
 * date               : 2022-05-11
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-11         최민서        최초 생성
 */

public class BmiList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AppleList.AppleService service = new AppleList.AppleServiceImpl();
        while (true) {
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByOrigin 6.findByColor 7.findAll 8.count 9.existsById 10.clear");
            switch (s.next()) {
                case "0":
                    return;
                case "1":
                    AppleList.Apple yd = new AppleList.Apple.Builder()
                            .origin("영동")
                            .color("RED")
                            .price(1000)
                            .build();
                    service.save(yd);
                    AppleList.Apple yd2 = new AppleList.Apple.Builder()
                            .origin("영동")
                            .color("BLUE")
                            .price(1500)
                            .build();
                    service.save(yd2);
                    AppleList.Apple pg = new AppleList.Apple.Builder()
                            .origin("풍기")
                            .color("RED")
                            .price(2000)
                            .build();
                    service.save(pg);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    System.out.println("5.findByOrigin");
                    System.out.println(service.findByOrigin("영동"));
                    break;
                case "6":
                    System.out.println("6.findByColor");
                    System.out.println(service.findByColor("RED"));
                    break;
                case "7":
                    break;
                default:
                    break;
            }
        }
    }
    @Data static class Bmi{
        private double height, weight;
        private String ssn, gender;
    }

    interface BmiService{
        void save(Bmi bmi);
        void update(int i, Bmi bmi);
        void delete(Bmi bmi);
        List<Bmi> findAll();
        List<Bmi> findByGender(String gender);
        Bmi findByID(int i);
        int count();
        void clear();

    }
    static class BmiServiceImpl implements BmiService{
        private final List<Bmi> list;

        public BmiServiceImpl() {
            this.list = new ArrayList<>();
        }

        @Override
        public void save(Bmi bmi) {
            list.add(bmi);
        }

        @Override
        public void update(int i,Bmi bmi) {
            list.set(i,bmi);
        }

        @Override
        public void delete(Bmi bmi) {
            list.remove(bmi);
        }

        @Override
        public List<Bmi> findAll() {
            return list;
        }

        @Override
        public List<Bmi> findByGender(String gender) {
            return null;
        }

        @Override
        public Bmi findByID(int i) {
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
