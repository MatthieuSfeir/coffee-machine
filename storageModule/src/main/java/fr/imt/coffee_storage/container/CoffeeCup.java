package fr.imt.coffee_storage.container;


import fr.imt.coffee_storage.coffeetype.CoffeeType;

public class CoffeeCup extends CoffeeContainer{
    public CoffeeCup(double capacity, CoffeeType coffeeType) {
        super(capacity, coffeeType);
    }

    public CoffeeCup(Container container, CoffeeType coffeeType) {
        super(container, coffeeType);
    }
}
