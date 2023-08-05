package org.example.pointcuts;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {

    int itemId;
    String itemName;
    float itemPrice;
    int availableQuantity;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getAvailableQuantity() {

        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public String toString() {

        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", availableQuantity=" + availableQuantity +
                '}';
    }

    public void printItemDetails(){

        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy - HH:mm:ss");
        Date date = new Date();

        System.out.format("Details for item %s at %s: \n%s\n",
                getItemName(),
                formatter.format(date),
                toString());
    }

}