package exam;

import java.util.Arrays;
import java.util.Random;

public class DietManager {


    public boolean areCompatible(Person person, Diet diet) {
        boolean b = true;
        // Loop through the person's allergies and check if it contains in the Diet.
        for(int i = 0; i< person.allergies.length; i++){
            if(Arrays.asList(diet.allowedFood).contains(person.allergies[i])){
                b = false;
            }
        }
        return b;
    }


    public HypercaloricDiet randomDiet(Person person, Food[] foods) {
        Random rand = new Random();
        //4B i
        int n = rand.nextInt(100)+1;
        //4B v
        int Weight = (int) (rand.nextInt(20)+ person.weight);
        //4B vi
        int minCaloriesPerDay = rand.nextInt(2000)+2000;

        //4B iii og iv
        Food[] nonAllergicFood = new Food[foods.length];
        int count = 0;
        for(int i = 0; i< foods.length; i++){
            if(!Arrays.asList(person.allergies).contains(foods[i])){
                nonAllergicFood[count] = foods[i];
                count++;
            }
        }

        // Requirement 4B ii the text "Random diet" has been added to the constructor.
        HypercaloricDiet HyperD = new HypercaloricDiet(n,"Random diet",nonAllergicFood,Weight,minCaloriesPerDay);

        return HyperD;
    }
}

