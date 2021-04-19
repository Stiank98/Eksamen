package exam;

public class LowCarbDiet extends Diet {
    float minWeightKg;

    public LowCarbDiet(int daysDuration, String purpose, Food[] allowedFood, float minWeightKg) {
        super(daysDuration, purpose, allowedFood);
        this.minWeightKg = minWeightKg;
    }
}
