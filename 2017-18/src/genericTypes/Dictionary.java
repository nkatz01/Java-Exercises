package genericTypes;

import java.util.Collection;
public interface Dictionary<K,V> {

    Collection<K> keys();
    Collection<V> values ();

    V put(K key, V value);


    V get(K key);

    boolean isEmpty ();


}