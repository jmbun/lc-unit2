package org.launchcode.studio4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    private final Map<MenuCategory, List<MenuItem>> itemsByCategory = new HashMap<>();
    private final List<MenuItem> items = new ArrayList<>();
    private LocalDateTime lastUpdated;

    public void add(MenuItem item) {
         if (!itemsByCategory.containsKey(item.getCategory())) {
            itemsByCategory.put(item.getCategory(), new ArrayList<>());
        }
        itemsByCategory.get(item.getCategory()).add(item);
        items.add(item);
        updated();
    }

    public void remove(MenuItem item) {
        if (itemsByCategory.containsKey(item.getCategory())) {
            itemsByCategory.get(item.getCategory()).remove(item);
        }
        items.remove(item);
        updated();
    }

    public List<MenuItem> getItemsByCategory(MenuCategory category) {
        return itemsByCategory.get(category);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void print() {
        System.out.println("=== Menu ===");
        System.out.println("Last Updated: " + lastUpdated);
        for(Map.Entry<MenuCategory, List<MenuItem>> entry : itemsByCategory.entrySet()) {
            System.out.println(String.format("Listing %s entries in category '%s'", entry.getValue().size(), entry.getKey()));
            for(MenuItem item : entry.getValue()) {
                item.print();
            }
        }
    }

    private void updated() {
        lastUpdated = LocalDateTime.now();
    }
}
