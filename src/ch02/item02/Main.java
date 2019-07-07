package ch02.item02;

/**
 * Name:Main
 * Desc :
 * Developer :82108
 * Date : 2019-07-07
 * Time : 오후 3:47
 */
import static ch02.item02.NyPizza.Size.*;
import static ch02.item02.Pizza.Topping.*;

public class Main {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240,8)
                .calories(100).sodium(35).carbohydrate(27).build();

        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

    }

}
