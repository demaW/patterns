package com.epam.patterns.facade;

public class ShopsFacade {
    private GroceryShop groceryShop = new GroceryShop();
    private SportShop sportShop = new SportShop();

    public double goForRegularShopping(){
        double food = groceryShop.buyGoods();
        double water = groceryShop.buyWater();
        return food + water;
    }

    public double goForShoppingAndSportGoods(){
        double food = groceryShop.buyGoods();
        double water = groceryShop.buyWater();
        double shoes = sportShop.buyShoes();
        return food + water + shoes;
    }
}
