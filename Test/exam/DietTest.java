package exam;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DietTest {

    Food M1 = new Food("Pizza",250,false,FoodType.Fat);
    Food M2 = new Food("Lassagne", 300, false, FoodType.Carb);
    Food M3 = new Food("Kyllingsalat", 100, false, FoodType.Protein);
    Food M4 = new Food("Salat", 50, true, FoodType.Protein);

    VeganDiet veganDiet;
    HypercaloricDiet hypercaloricDiet;
    FlexiarianDiet flexiarianDiet;
    LowCarbDiet lowCarbDiet;

    @Before
    public void initialization() throws Exception{
        Food[] tabell = {M4};
        Food[] tabell2 = {M1,M2,M3};
        veganDiet =  new VeganDiet(3,"People who dont like to eat meat", tabell,50);
        lowCarbDiet = new LowCarbDiet(70,"How to lose weight",tabell2,50);
        flexiarianDiet = new FlexiarianDiet(400,"Flexi diett",tabell,50, M3);
        hypercaloricDiet = new HypercaloricDiet(40, "Hyper cal diett", tabell, 50,50);
    }

    @Test
    public void dietWriteDurationLessThanOneMonthTest() {
        Assert.assertTrue(veganDiet.writeDuration().equals("This VeganDiet lasts for 3 days"));
    }
//
    @Test
    public void dietWriteDurationLessThanOneYearTest() {
        Assert.assertTrue(hypercaloricDiet.writeDuration().equals("This HypercaloricDiet lasts for 1 months and 9 days"));
        Assert.assertTrue(lowCarbDiet.writeDuration().equals("This LowCarbDiet lasts for 2 months and 8 days"));
    }

    @Test
    public void dietWriteDurationMoreThanOneYearTest() {
        Assert.assertTrue(flexiarianDiet.writeDuration().equals("This FlexiarianDiet lasts for 1 years, 1 month and 4 days"));
    }

    @Test
    public void dietWriteAllowFoodTest() {
        Assert.assertTrue(lowCarbDiet.writeAllowedFood().equals("The following food is allowed in this LowCarbDiet: Pizza,Lassagne,Kyllingsalat,"));
    }
    @Test
    public void isVeganTest()throws Exception{
        Food[] vegan = {M4};
        Food[] nonVegan = {M1,M2,M3};
        veganDiet =  new VeganDiet(3,"People who dont like to eat meat",vegan,50);
        lowCarbDiet = new LowCarbDiet(70,"How to lose weight",nonVegan,50);
        Assert.assertTrue(veganDiet.IsVegan);
        Assert.assertFalse(lowCarbDiet.IsVegan);
    }
}


