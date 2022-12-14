package com.driver;

public class Pizza
{

    private int price;
    int c = 1;
    int c1 =1;
    int p1;
    int p2;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int carryBag;
    private int extraToppings;

    public Pizza(Boolean isVeg)
    {
        if(isVeg)
        {
            this.isVeg = isVeg;
            this.price = 300;
            p1 = 300;
            this.extraCheese = 80;
            this.carryBag = 20;
            this.extraToppings = 70;
            p2 = 70;
        }
        else
        {
            this.isVeg = isVeg;
            this.price = 400;
            p1 = 400;
            this.extraCheese = 80;
            this.carryBag = 20;
            this.extraToppings = 120;
            p2 = 120;
        }
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here

        if(c == 1)
        {
            price += extraCheese;
            c--;
        }

    }

    public void addExtraToppings()
    {

        if(c1 == 1)
        {
            price += extraToppings;
            c1--;
        }

    }

    public void addTakeaway()
    {
        price+=carryBag;
    }

    public String getBill()
    {
        return "Base Price Of The Pizza": p1"\n"
        "Extra Cheese Added": extraCheese"\n"
        "Extra Toppings Added": p2"\n"
        "Paperbag Added": carryBag"\n"
        "Total Price": price;
    }
}
