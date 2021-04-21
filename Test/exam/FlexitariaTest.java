package exam;
import org.junit.Assert;
import org.junit.Test;

public class FlexitariaTest {


    Food M1 = new Food("Pizza",250,false,FoodType.Fat);
    Food M2 = new Food("Lassagne", 300, false, FoodType.Carb);
    Food M3 = new Food("Kyllingsalat", 100, false, FoodType.Protein);
    Food M4 = new Food("Salat", 50, true, FoodType.Protein);


    @Test
    public void preferredMeatTest(){
        try{
            Food[] allowedFood = {M1,M2,M3,M4};
            FlexiarianDiet flexiarianDiet = new FlexiarianDiet(10,"wannabe vegan diet",allowedFood,200,M4);
        }catch(Exception e){
            Assert.assertTrue(e.getMessage().equals("Prefer meat must be non-vegan food of protein type"));
        }
    }
}

