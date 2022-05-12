package kr.readvice.api.common.dataStructure;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

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
public class Trunk<K, V>{
    private HashMap<K, V> map;
    public Trunk(){this.map = new HashMap<>();}

    public void save(K k, V v){
        map.put(k,v);
    }
    public void update(K k, V v){
        map.replace(k,v);
    }
    public void delete(K k){
        map.remove(k);
    }
    public List<V> findAll() {
        return (List<V>)map.values();
    }

    public V findById(K k) {
        return map.get(k);
    }

    public List<V> findByName(String name) {
        return null;
    }

    public Boolean existsById(K k) {
        return map.containsKey(k);
    }

    public int count() {
        return map.size();
    }

    public void clear() {
        map.clear();
    }
}

