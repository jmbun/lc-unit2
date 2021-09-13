package org.launchcode.studio4;

import java.util.List;
import java.util.Map;

public class MenuItem {
    private final MenuCategory category;
    private final String description;

    private double priceDollars;
    private boolean isNew;

    public MenuItem(MenuCategory category, String description, double priceDollars) {
        this(category, description, priceDollars, true);
    }

    public MenuItem(MenuCategory category, String description, double priceDollars, boolean isNew) {
        this.category = category;
        this.description = description;
        this.priceDollars = priceDollars;
        this.isNew = isNew;
    }

    public MenuCategory getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceDollars() {
        return priceDollars;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPriceDollars(double priceDollars) {
        this.priceDollars = priceDollars;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void print() {
        System.out.println("= MenuItem =");
        System.out.println("Category: " + category);
        System.out.println("Description: " + description);
        System.out.println("Price: " + priceDollars);
        System.out.println("Is New: " + isNew);
    }
}
