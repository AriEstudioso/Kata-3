package viewmodel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram<T> implements Iterable<T> {
    private final Map<T, Integer> map;

    public Histogram() {
        this.map = new HashMap<>();
    }

    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    public void put(T bin){
        map.put(bin, count(bin) + 1);
    }

    public Integer count(T bin){
        return map.getOrDefault(bin, 0);
    }

}
