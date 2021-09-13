package org.launchcode.studio4;

public class Studio4 {
    private static final MenuItem[] menuItems = {
        new MenuItem(MenuCategory.MainCourse, "Ratatouille", 50),
        new MenuItem(MenuCategory.Dessert, "Ice Cream", 3),
        new MenuItem(MenuCategory.Appetizer, "Whole Watermelon", 35)
    };

    public static void main(String[] args) {
        Menu menu = new Menu();
        for(MenuItem item : menuItems) {
            menu.add(item);
        }
        menu.print();
        menuItems[2].print();
        menu.remove(menuItems[1]);
        menu.print();
    }
}
