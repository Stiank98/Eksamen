package exam;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class DietManagerTest {

    DietManager dietManager = new DietManager();
    Food M1 = new Food("Pizza",250,false,FoodType.Fat);
    Food M2 = new Food("Lassagne", 300, false, FoodType.Carb);
    Food M3 = new Food("Kyllingsalat", 100, false, FoodType.Protein);
    Food M4 = new Food("Salat", 50, true, FoodType.Protein);

    Person person1;
    Person person2;
    LowCarbDiet lowCarbDiet;



    @Before
    public void initialization() throws Exception{
        Food[] allergic1 = {M3};
        Food[] allergic2 = {M4};
        Food[] tabell = {M1,M2,M3,M1};
        lowCarbDiet = new LowCarbDiet(70,"Folk som vil gå ned i vekt",tabell,90);
        person1 = new Person(M1,allergic1, lowCarbDiet, 80);
        person2 = new Person(M1,allergic2, lowCarbDiet, 80);
    }

    @Test
    public void areCompatibleTest(){
        Assert.assertFalse(dietManager.areCompatible(person1,lowCarbDiet));
        Assert.assertTrue(dietManager.areCompatible(person2,lowCarbDiet));
    }

    @Test
    public void randomDietTest() {
        Food[] tabell = {M1,M2,M4};
        HypercaloricDiet hypercaloricDiet = dietManager.randomDiet(person1,tabell);
        Assert.assertTrue(hypercaloricDiet.purpose.equals("Random diet"));
        Assert.assertTrue(hypercaloricDiet.maxWeightKg > person1.weight && hypercaloricDiet.maxWeightKg < person1.weight+20);
        Assert.assertFalse(Arrays.asList(hypercaloricDiet.allowedFood).contains(M3));
    }
}
