package exam;

public class LowCarbDiet extends Diet {
    float minWeightKg;

    public LowCarbDiet(int daysDuration, String purpose, Food[] allowedFood, float minWeightKg) throws Exception {
        super(daysDuration, purpose, allowedFood);
        this.minWeightKg = minWeightKg;
        // oppgave 1 E
        int carbType = 0;
        for(int i = 0; i < allowedFood.length; i++){
            if(allowedFood[i].type == FoodType.Carb){
                carbType++;
            }
        }
        if(carbType>=2)throw new Exception("To many carbs here!");
    }
}
