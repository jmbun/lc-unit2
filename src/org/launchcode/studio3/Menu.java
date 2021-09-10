package org.launchcode.studio3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    private final Map<MenuCategory, List<MenuItem>> itemsByCategory = new HashMap<>();
    private final List<MenuItem> items = new ArrayList<>();
    private LocalDateTime lastUpdated;

    public List<MenuItem> getItemsByCategory(MenuCategory category) {
        return itemsByCategory.get(category);
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
