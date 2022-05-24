package kr.readvice.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import kr.readvice.api.user.domains.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * packageName: kr.readvice.api.common.dataStructure
 * fileName        : Trunk
 * author           : 최민서
 * date               : 2022-05-12
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-12         최민서        최초 생성
 */
@Component @Data @Lazy
public class Box<K, V>{
    private HashMap<K, V> map;
    public Box(){this.map = new HashMap<>();}

    public void put(K k, V v){
        map.put(k,v);
    }
    public void replace(K k, V v){
        map.replace(k,v);
    }
    public void remove(K k){
        map.remove(k);
    }
    public List<V> values() {return map.values().stream().collect(Collectors.toList());}
    public V get(K k) {
        return map.get(k);
    }
    public Boolean containsKey(K k) {
        return map.containsKey(k);
    }
    public int size() {
        return map.size();
    }
    public void clear() {
        map.clear();
    }
    // custom

    //테이블 목록록
   public List<V> findAllList(){
        List<V> ls = new ArrayList<>();
        for(Map.Entry<K,V> e: map.entrySet()){
            ls.add((V)e.getValue());
        }
        return ls;
    }
    public List<V> findAllKeyList(){
        List<V> ls = new ArrayList<>();
        for(Map.Entry<K,V> e: map.entrySet()){
            ls.add((V)e.getValue());
        }
        return ls;
    }
    public List<User> findByUserName(String name){
        List<User> ls = new ArrayList<>();
        for(User v: ls){if(name.equals((v.getName())))ls.add(v);}
        return ls;
    }
    public Map<String, User> mapFindByUserName(String name){
        Map<String, User> map = new HashMap<>();
        for(Map.Entry<String, User> e : map.entrySet()){
            if(name.equals(e.getValue().getName())) map.put(e.getKey(), e.getValue());
        }
        return map;
    }
}

