package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * packageName: kr.readvice.api.common.dataStructure
 * fileName        : ItemCRUD
 * author           : 최민서
 * date               : 2022-05-10
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-10         최민서        최초 생성
 */

public class ItemCRUD {
    @Data @AllArgsConstructor class Item{
        private int id;
        private String name;
        private int price;
    }
    interface ItemService{
        void save (Item item);
        void update (Item item);
        void delete (Item item);
        List<Item> findAll();
        Item findById(String id);
        List<Item> findByName(String name);
        Boolean existsById(String id);
        int count();
    }
    @RequiredArgsConstructor class ItemServiceImpl implements ItemService{
        @Override
        public void save(Item item) {

        }

        @Override
        public void update(Item item) {

        }

        @Override
        public void delete(Item item) {

        }

        @Override
        public List<Item> findAll() {
            return null;
        }

        @Override
        public Item findById(String id) {
            return null;
        }

        @Override
        public List<Item> findByName(String name) {
            return null;
        }

        @Override
        public Boolean existsById(String id) {
            return null;
        }

        @Override
        public int count() {
            return 0;
        }
    }
    @Test void itemAppTest(){

    }
}
