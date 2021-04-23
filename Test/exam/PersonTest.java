package exam;


import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    Food M1 = new Food("Pizza",250,false,FoodType.Fat);
    Food M2 = new Food("Lassagne", 300, false, FoodType.Carb);
    Food M3 = new Food("Kyllingsalat", 100, false, FoodType.Protein);
    Food M4 = new Food("Salat", 50, true, FoodType.Protein);

    @Test
    public void veganFavouriteFoodTest() {
        Food[] allergic = {M2};
        Food[] allowedFood = {M4};
        try {
            VeganDiet veganDiet = new VeganDiet(5, "Im vegan", allowedFood, 100);
            Person person = new Person(M1,allergic, veganDiet, 90);
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().equals("Favorite food is non-vegan, they cannot follow a VeganDiet."));
        }
    }

    @Test
    public void allargicToMoreThan50PercentTest() {
        Food[] allergic = {M2,M3};
        Food[] allowedFood = {M1,M2,M3,M4};
        try {
            LowCarbDiet lowCarbDiet = new LowCarbDiet(70,"Folk som vil gå ned i vekt",allowedFood,80);
            Person person = new Person(M1,allergic, lowCarbDiet, 90);
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().equals("This person allergic to 50% more of the food allowed by the diet."));
        }
    }

    @Test
    public void lowCarbWeightTest() {
        Food[] allergic = {};
        Food[] allowedFood = {M1};
        try {
            LowCarbDiet lowCarbDiet = new LowCarbDiet(70,"Folk som vil gå ned i vekt",allowedFood,100);
            Person person = new Person(M1,allergic, lowCarbDiet, 90);
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().equals("The weight to this person is lower than the low carbo diet minimum weight"));
        }
    }

    @Test
    public void hyperCalDietWeightTest() {
        Food[] allergic = {};
        Food[] allowedFood = {M1,M2};
        try {
            HypercaloricDiet hypercaloricDiet = new HypercaloricDiet(40, "Hyper cal diett", allowedFood, 50,50);
            Person person = new Person(M1,allergic, hypercaloricDiet, 90);
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().equals("The weight to this person is higher than the hyper cal diet minimum weight"));
        }

    }
    @Test
    public void veganDietWeightTest(){
        Food[] allergic = {};
        Food[] allowedFood = {M4};
        try {
            VeganDiet veganDiet = new VeganDiet(34,"Vegan Diett",allowedFood,64);
            Person person = new Person(M4,allergic,veganDiet,50);
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().equals("The weight to this person is lower than the Vegan diet minimum weight"));
        }
    }
}
