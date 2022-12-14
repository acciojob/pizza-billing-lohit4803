package com.driver;

public class Pizza
{

    private int price;
    int c = 1;
    int c1 =1;
    int c2 =1;
    int c3 = 1;
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
        this.bill = "Base Price Of The Pizza: "+this.price + "\n";
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
        if(c2 == 1) {
            price += carryBag;
            c2--;
        }
    }

    public String getBill()
    {
        if(c3 == 1)
        {
            c3 = 0;

            if(c == 0)
            {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheese + "\n";
            }
            if(c1 == 0)
            {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppings + "\n";
            }
            if(c2 == 0)
            {
                this.bill = this.bill + "Paperbag Added: " + this.carryBag + "\n";
            }
            this.bill = this.bill + "Total Price: "+this.price + "\n";
        }
        return this.bill;
    }
}
