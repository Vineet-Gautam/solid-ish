package decoratorPattern.toppings;

import decoratorPattern.basePizza.BasePizza;

public class onion extends toppingDecorator {
    BasePizza basePizza;

    public onion(BasePizza pizza) {
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 40;
    }
}
