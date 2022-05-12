package kr.readvice.api.common.dataStructure;

import jdk.jfr.Label;
import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * fileName        : Box
 * author           : 최민서
 * date               : 2022-05-12
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-12         최민서        최초 생성
 */
@Component @Data @Lazy
public class Box<T>{
    private ArrayList<T> list;
    public Box(){ this.list = new ArrayList<>();}

    public void add(T t){
        list.add(t);
    }
    public void set(int i, T t){
        list.set(i,t);
    }
    public void remove(T t){
        list.remove(t);
    }
    public List<T> get(){
        return list;
    }
    public T getI(int i){
        return list.get(i);
    }
    public int size(){
        return list.size();
    }
    public void clear(){
        list.clear();
    }
}
