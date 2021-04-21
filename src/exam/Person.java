package exam;

import java.util.Arrays;

public class Person {
    Food favoritefood;
    Food[] allergies;
    Diet diet;
    float weight;

    public Person(Food favoritefood, Food[] allergies, Diet diet, float weight)throws Exception{
        this.favoritefood = favoritefood;
        this.allergies = allergies;
        this.diet = diet;
        this.weight = weight;
        // oppgave 2A.  their favorite food is non-vegan, they cannot follow a VeganDiet.
        if(!favoritefood.isVegan && VeganDiet.class.isInstance(diet)){
            throw new Exception("Favorite food is non-vegan, they cannot follow a VeganDiet.");
        }
        // Loope gjennom og teller antall allergiske mat i dietten. Oppgave 2B
        int totalallergi = 0;
        for(int i = 0;i<diet.allowedFood.length; i++){
            if(Arrays.asList(allergies).contains(diet.allowedFood[i])){
                totalallergi++;
            }
        }
        // Regne ut mer om person er mer 50% allergisk til maten. oppgave 2B
        if((double)totalallergi>=(double)diet.allowedFood.length/2){
            throw new Exception("This person allergic to 50% more of the food allowed by the diet.");
        }
        //2C personen sin vekt kan ikke være mindre enn dietten sin minimums vekt
        if(VeganDiet.class.isInstance(diet)){
            VeganDiet v = (VeganDiet) diet;
            if(v.minWeightKg < weight){
                throw new Exception("The weight to this person is lower than the Vegan diet minimum weight");
            }
        }
        //2C personen sin vekt kan ikke være mindre enn dietten sin minimums vekt
        if(LowCarbDiet.class.isInstance(diet)) {
            LowCarbDiet l = (LowCarbDiet) diet;
            if(l.minWeightKg > weight) {
                throw new Exception("The weight to this person is lower than the low carbo diet minimum weight");
            }
        }
        //2D personen sin vekt kan ikke være mer enn hyper cal dietten sin max vekt
        if(HypercaloricDiet.class.isInstance(diet)) {
            HypercaloricDiet h = (HypercaloricDiet) diet;
            if (h.maxWeightKg < weight) {
                throw new Exception("The weight to this person is higher than the hyper cal diet minimum weight");
            }
        }
    }
}
