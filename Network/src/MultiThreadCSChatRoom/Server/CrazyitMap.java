package MultiThreadCSChatRoom.Server;

import java.io.ObjectInputStream;
import java.util.*;

public class CrazyitMap<K, V> {
    public Map<K, V> map = Collections.synchronizedMap(new HashMap<>(K, V));

    public synchronized  void removeByValue(Object value) {
        for(Object key : map.keySet()) {
            if(map.get(key) == value) {
                map.remove(key);
                break;
            }
        }
    }

    public synchronized Set<V> valueSet() {
        Set<V> result = new HashSet<V>();

        map.forEach((key, value) -> result.add(value));
        return result;
    }


}
