package kr.readvice.api.common.dataStructure;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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
