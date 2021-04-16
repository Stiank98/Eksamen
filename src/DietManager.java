import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class DietManager {


    public boolean areCompatible(Person person, Diet diet) {

        boolean b = true;
        // loope gjennom person sine allergier og sjekker om det innholder i Dieten.
        for(int i = 0; i< person.allergies.length; i++){
            if(Arrays.asList(diet.allowedFood).contains(person.allergies[i])){
                b = false;
            }
        }

        return b;
    }


    public HypercaloricDiet randomDiet(Person person, Food[] foods) {

        HypercaloricDiet HyperD = new HypercaloricDiet();


        Random rand = new Random();
        int n = rand.nextInt(100)+1;
        HyperD.daysDuration = n;

        HyperD.purpose = "Random diet";

        HyperD.MaxWeightKg = rand.nextInt(20)+ person.weight;

        HyperD.minCaloriesPerDay = rand.nextInt(2000)+2000;
        Food[] nonAllergicFood = new Food[foods.length];
        int count = 0;
        for(int i = 0; i< foods.length; i++){
            if(!Arrays.asList(person.allergies).contains(foods[i])){
                nonAllergicFood[count] = foods[i];
                count++;
            }
        }
// Min allergic food må trimmes innholder tomme plasser.
        HyperD.allowedFood = nonAllergicFood;


        return HyperD;}
}

