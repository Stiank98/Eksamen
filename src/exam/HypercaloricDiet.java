package exam;

public class HypercaloricDiet extends Diet{
     float maxWeightKg;
     float minCaloriesPerDay;

     public HypercaloricDiet(int daysDuration, String purpose, Food[] allowedFood, float maxWeightKg, float minCaloriesPerDay) {
          super(daysDuration, purpose, allowedFood);
          maxWeightKg = maxWeightKg;
          this.minCaloriesPerDay = minCaloriesPerDay;
     }
}
