package ru.billing.stocklist;

import java.util.Objects;

public class GenericItem {
    private int currentID = 1;
    private int ID;
    private String name; // Наименование товара
    private float price; //Цена товара
    private GenericItem analogue; // analogue product
    private Category category = Category.GENERAL;

    public GenericItem(String name, float price, Category category) {
        ID = currentID++;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public GenericItem(String name, float price, GenericItem analogue){
        ID = currentID++;
        this.name = name;
        this.price = price;
        this.analogue = analogue;
    }
    public GenericItem(){
        ID = currentID++;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenericItem)) return false;
        GenericItem that = (GenericItem) o;
        return ID == that.ID && Float.compare(that.price, price) == 0 && Objects.equals(name, that.name) && Objects.equals(analogue, that.analogue) && category == that.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, price, analogue, category);
    }

    @Override
    public GenericItem clone(){
        GenericItem newItem = new GenericItem(this.name, this.price, this.category);
        newItem.analogue = analogue;
        return newItem;
    }

    @Override
    public String toString() {
        return "ru.billing.stocklist.GenericItem{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", analogue=" + analogue +
                ", category=" + category +
                '}';
    }
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public GenericItem getAnalogue() {
        return analogue;
    }

    public void setAnalogue(GenericItem analogue) {
        this.analogue = analogue;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
