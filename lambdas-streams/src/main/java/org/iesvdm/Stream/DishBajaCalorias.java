package org.iesvdm.Stream;

public class DishBajaCalorias {
    public boolean evaluar(Dish d) {
     return d.getCalories() < 400;
    }
}
