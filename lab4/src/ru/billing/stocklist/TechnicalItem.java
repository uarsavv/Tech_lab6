package ru.billing.stocklist;

import java.util.Objects;

public class TechnicalItem extends GenericItem {
    short warrantyTime; // гарантийный срок (суток)

    public TechnicalItem(String name, float price, short warrantyTime) {
        super(name, price, Category.GENERAL);
        this.warrantyTime = warrantyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TechnicalItem)) return false;
        if (!super.equals(o)) return false;
        TechnicalItem that = (TechnicalItem) o;
        return warrantyTime == that.warrantyTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), warrantyTime);
    }

    @Override
    public TechnicalItem clone(){
        TechnicalItem newItem = new TechnicalItem(super.getName(), super.getPrice(), this.warrantyTime);
        return newItem;
    }

    @Override
    public String toString() {
        return "ru.billing.stocklist.TechnicalItem{" +
                ", ID=" + super.getID() +
                ", name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                ", analogue=" + super.getPrice() +
                ", category=" + super.getCategory() +
                ", warrantyTime=" + warrantyTime +
                '}';
    }
}
