package decoratorPattern.toppings;

import decoratorPattern.basePizza.BasePizza;

public class extraCheese extends toppingDecorator {
    BasePizza basePizza;

    public extraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 60;
    }
}
