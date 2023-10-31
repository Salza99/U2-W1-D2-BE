package DavideSalzani.U2W1D2BE;

import DavideSalzani.U2W1D2BE.entities.Menu;
import DavideSalzani.U2W1D2BE.entities.Pizza;
import DavideSalzani.U2W1D2BE.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
public class U2W1D2BEApplication {
    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(Menu.class, args);

        Menu menu = context.getBean(Menu.class);
        Pizza margherita = new Pizza("margherita", 4.5);
        Pizza prosciutto = new Pizza("prosciutto", 5.0);
        Topping prosciuttoTopping = new Topping("prosciutto", 45, 0.5);
        prosciutto.addIngredients(prosciuttoTopping);
        menu.addPizza(margherita);
        menu.addPizza(prosciutto);


        System.out.println("Menu:");
        System.out.println("Pizzas:");
        menu.getPizzas().forEach(pizza -> System.out.println(pizza.getName()));
        System.out.println("Beverages:");
        menu.getBeverages().forEach(beverage -> System.out.println(beverage.getName()));
    }
}
