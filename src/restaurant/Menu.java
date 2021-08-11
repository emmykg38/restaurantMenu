package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    private LocalDate lastUpdated;


    public void addMenuItem(MenuItem item) {
        if (menuItems.contains(item)) {
            System.out.println("That dish is already on the menu!");
            return;
        }
        menuItems.add(item);
        item.setNew(true);
        menuUpdated();
    }


    public void removeMenuItem(MenuItem item) {
            menuItems.remove(item);
            menuUpdated();
    }


    public void menuUpdated() {
        this.lastUpdated = LocalDate.now();
    }



    public void printMenu() {
        System.out.println("APPETIZERS");
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                item.printMenuItem();
            }
        }

        System.out.println();
        System.out.println("MAIN COURSE");
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main")) {
                item.printMenuItem();
            }
        }
    }


    //getters setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                '}';
    }
}
