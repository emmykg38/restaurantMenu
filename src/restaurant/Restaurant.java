package restaurant;

import java.time.LocalDate;

public class Restaurant {

    public static void main (String[] args) {
        MenuItem chickenSaladSandwich = new MenuItem("Chicken Salad Sandwich", "main",
        13.50, "Classic chicken salad served with fresh arugula, heirloom tomatoes, and " +
                "red onion. Served on rustic sourdough with sauerkraut and house-brined spicy pickles.", LocalDate.now());

        MenuItem cousCousSalad = new MenuItem("CousCous Salad", "appetizer", 7.50,
                "Fresh tomatoes, cucumbers, red onion and parsley tossed with olive oil and sumac.", LocalDate.now());

        MenuItem fruitSalad = new MenuItem("Fruit Salad", "dessert", 6.50, "Seasonal" +
                "fruits, including watermelon, pineapple, blueberries, raspberries, figs, etc. Ask your server to" +
                " confirm what's in season right now.", LocalDate.now());

        MenuItem grapeLeaves = new MenuItem("Grape Leaves", "appetizer", 4.5, "Hand-rolled grape" +
                "leaves stuffed with rice, dill, mint, and finished with a kick of lemon. Eight rolls per order.", LocalDate.now());

        MenuItem shavedScallops = new MenuItem("Shaved Scallops", "appetizer", 18.5, "House-cured " +
                "wild-caught scallops, thinly shaved and dressed with olive oil and lemon. Topped with fresh dill and lemon verbena.",
                LocalDate.now());

        MenuItem gravLox = new MenuItem("GravLox", "main", 17.5, "House-cured Alaskan salmon atop" +
                " a New-York-sized serving of cashew-based cream cheese on our famous nut + seed bread. Notes of sumac and" +
                " pink peppercorn.", LocalDate.now());





        Menu summerMenu = new Menu();

        summerMenu.addMenuItem(chickenSaladSandwich);
        summerMenu.addMenuItem(cousCousSalad);
        summerMenu.addMenuItem(fruitSalad);
        summerMenu.addMenuItem(grapeLeaves);
        summerMenu.addMenuItem(shavedScallops);
        summerMenu.addMenuItem(gravLox);


//        chickenSaladSandwich.checkItemNew();


        summerMenu.printMenu();

        System.out.println("Menu last updated on " + summerMenu.getLastUpdated());

    }
}
