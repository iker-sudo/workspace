package org.iesvdm.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ProcesarDespuesDeStream {

	public static boolean filtrarMenos400Cal(Dish d) {
		return d.getCalories() < 400;
	}

    public static void main(String[] args) {

        				List<Dish> menu = Arrays.asList( 
				 new Dish("pork", false, 800, Dish.Type.MEAT),
				 new Dish("beef", false, 700, Dish.Type.MEAT),
				 new Dish("chicken", false, 400, Dish.Type.MEAT),
				 new Dish("french fries", true, 530, Dish.Type.OTHER),
				 new Dish("rice", true, 350, Dish.Type.OTHER),
				 new Dish("season fruit", true, 120, Dish.Type.OTHER),
				 new Dish("pizza", true, 550, Dish.Type.OTHER),
				 new Dish("prawns", false, 300, Dish.Type.FISH),
				 new Dish("salmon", false, 450, Dish.Type.FISH) );
                 
                Predicate<Dish> dishBajasCalorias = d -> d.getCalories() < 400;

                 List<String> listLowCalories = menu.stream() 
                 .filter(x -> x.getCalories() < 400) //Despues de este metodo en el flujo que sigue solo hay platos de menos de 400 Calorias
                    .sorted(Comparator.comparing(d -> d.getCalories())) //Ordena los platos por calorias
                    .map(d -> d.getName()) //Transforma el flujo de platos en un flujo
                    .toList();

                System.out.println(listLowCalories);


    }
}
