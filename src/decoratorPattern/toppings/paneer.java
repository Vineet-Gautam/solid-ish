package decoratorPattern.toppings;

import decoratorPattern.basePizza.BasePizza;

public class paneer extends toppingDecorator {
    BasePizza basePizza;

    public paneer(BasePizza pizza) {
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 70;
    }
}
