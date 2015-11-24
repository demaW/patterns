package com.epam.patterns.facade;

public class FacadeMain {
    public static void main(String[] args){
        ShopsFacade shopsFacade = new ShopsFacade();

        System.out.println("When I go for regular shopping I will spend: " + shopsFacade.goForRegularShoppin() + " $");
        System.out.println("When I go for shopping to Grocery an Sport Shop I will spend: " + shopsFacade.goForShoppingAndSportGoods() + " $");
    }
}
