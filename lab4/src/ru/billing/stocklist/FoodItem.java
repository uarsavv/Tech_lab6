package ru.billing.stocklist;

import java.util.Date;
import java.util.Objects;

public class FoodItem extends GenericItem {
    private Date dateOfIncome;
    private short expires; // срок годности

    public FoodItem(String name, float price, FoodItem analog, Date date, short expires) {
        super(name, price, analog);
        this.dateOfIncome = date;
        this.expires = expires;
    }

    public FoodItem(String name, float price, short expires) {
        super(name, price, Category.GENERAL);
        this.expires = expires;
    }

    public FoodItem(String name) {
        super(name, 0f, Category.GENERAL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodItem)) return false;
        if (!super.equals(o)) return false;
        FoodItem foodItem = (FoodItem) o;
        return expires == foodItem.expires && Objects.equals(dateOfIncome, foodItem.dateOfIncome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dateOfIncome, expires);
    }

    @Override
    public FoodItem clone() {
        FoodItem newItem = new FoodItem(super.getName(), super.getPrice(), this.expires);
        newItem.dateOfIncome = this.dateOfIncome;
        return newItem;
    }

    @Override
    public String toString() {
        return "ru.billing.stocklist.FoodItem{" +
                "dateOfIncome=" + dateOfIncome +
                ", expires=" + expires +
                ", ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", analogue=" + super.getPrice() +
                ", category=" + super.getCategory() +
                '}';
    }

    public Date getDateOfIncome() {
        return dateOfIncome;
    }

    public void setDateOfIncome(Date dateOfIncome) {
        this.dateOfIncome = dateOfIncome;
    }

    public short getExpires() {
        return expires;
    }

    public void setExpires(short expires) {
        this.expires = expires;
    }
}



