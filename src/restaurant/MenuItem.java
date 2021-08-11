package restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;


public class MenuItem {

    //fields
    private String name;
    private double price;
    private String category;
    private String description;
    private LocalDate date;
    private Boolean isNew;



    //constructor
    public MenuItem (String name, String category, double price, String description, LocalDate date){
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.date = date;
    }


    public void checkItemNew() {
        long daysBetween = ChronoUnit.DAYS.between(date, LocalDate.now());
        if (daysBetween > 30) {
            isNew = false;
        } else {
            isNew = true;
        }
    }

    public void printMenuItem() {
        System.out.println(this.getName() + " $" + this.getPrice() + "0\n" + this.getDescription());
        if (this.isNew == true) {
            System.out.println("**NEW ITEM**\n");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(getName(), menuItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), category, getDescription(), isNew);
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", isNew=" + isNew +
                '}';
    }
}
