package DavideSalzani.U2W1D2BE.entities;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Menu {
    public List<Pizza> pizzas;
    public List<Drink> beverages;

    public Menu() {
        pizzas = new ArrayList<>();
        beverages = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addBeverage(Drink beverage) {
        beverages.add(beverage);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }



    public List<Drink> getBeverages() {
        return beverages;
    }


}
