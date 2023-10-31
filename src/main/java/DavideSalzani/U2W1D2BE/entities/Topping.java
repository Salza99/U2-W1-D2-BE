package DavideSalzani.U2W1D2BE.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class Topping {
    private String name;
    private int calories;
    private Double price;


    public Topping(String name, int calories, Double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public Topping() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
