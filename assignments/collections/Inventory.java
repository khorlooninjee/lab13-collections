// Inventory.java
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> items = new HashMap<>();

    public void addItem(String name) {
        items.merge(name, 1, Integer::sum);
    }

    public void removeItem(String name) {
        if (!items.containsKey(name)) {
            return;
        }

        int count = items.get(name) - 1;

        if (count <= 0) {
            items.remove(name);
        } else {
            items.put(name, count);
        }
    }

    public boolean hasItem(String name) {
        return items.containsKey(name) && items.get(name) > 0;
    }

    public int getCount(String name) {
        return items.getOrDefault(name, 0);
    }
}