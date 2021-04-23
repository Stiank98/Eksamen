package exam;

import java.lang.Exception;

public class FlexiarianDiet extends Diet {
    float maxMeatGramsPerWeek;
    Food preferredMeat;

    //1E The maximum carb-type foods that can be included in a LowCarbDiet is two.
    public boolean isProtein(Food food){
       if(food.type == FoodType.Protein){
           return true;
       }
       else{
           return false;
       }
    }

    public FlexiarianDiet(int daysDuration, String purpose, Food[] allowedFood, float maxMeatGramsPerWeek, Food preferredMeat) throws Exception {
        super(daysDuration, purpose, allowedFood);
        this.maxMeatGramsPerWeek = maxMeatGramsPerWeek;
    // 1D. The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
        if(!isProtein(preferredMeat) || preferredMeat.isVegan) throw new Exception("Prefer meat must be non-vegan food of protein type");
        this.preferredMeat = preferredMeat;
    }
}
