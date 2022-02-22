Q3) write a java program that is menu based selection for hotel to order the
South indian dish, North indian Dish, Rajasthani Dish, Gujrati Dish, Bengali Dish
and Deserts with price of each dish and find the total sum and apply a bonus
desert if bill value is above Rs.500. 

Ans.
package com.org.gen.day1;
class Dishes {
    int category;
    String itemName;
    int price;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}