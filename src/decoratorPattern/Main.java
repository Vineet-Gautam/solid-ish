package decoratorPattern;

import decoratorPattern.basePizza.*;
import decoratorPattern.toppings.*;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Margherita();
        pizza = new onion(pizza);
        pizza = new paneer(pizza);

        BasePizza farm = new onion(new Farmhouse());

        System.out.println(pizza.cost());
        System.out.println(farm.cost());
    }
}
