package exam;
import org.junit.Assert;
import org.junit.Test;

public class LowCarbDietTest {

    Food M1 = new Food("Pizza",250,false,FoodType.Carb);
    Food M2 = new Food("Lassagne", 300, false, FoodType.Carb);
    @Test
    public void  lowCarbDietTest(){
        try{
            Food[] allowedFood = {M1,M2};

            LowCarbDiet lowCarbDiet = new LowCarbDiet(32,"Food for losing weight",allowedFood,40);
        } catch (Exception e){
            Assert.assertTrue(e.getMessage().equals("To many carbs here!"));
        }
    }
}
