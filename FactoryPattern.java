public class FactoryPattern {

    // Parent Pizza class
    static class Pizza {
        public void prepare() {
            System.out.println("Preparing " + this.getClass());
        }
    }

    // CheesePizza
    static class CheesePizza extends Pizza {
    }

    // VeggiePizza
    static class VeggiePizza extends Pizza {
    }

    // Factory Class
    static class PizzaFactory {
        public Pizza createPizza(String type) {
            if (type == "cheese") {
                return new CheesePizza();
            } else if (type == "veggie") {
                return new VeggiePizza();
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        // Factory
        PizzaFactory factory = new PizzaFactory();

        // Create a Cheese Pizza
        Pizza cheesePizza = factory.createPizza("cheese");
        cheesePizza.prepare();

        // Create a Veggie Pizza
        Pizza veggiePizza = factory.createPizza("veggie");
        veggiePizza.prepare();
    }

}
